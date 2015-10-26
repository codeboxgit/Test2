package com.test.file;

import java.io.File;//io, input output
import java.util.Calendar;

public class Ex60_File {

	public static void main(String[] args) {
		
		//Ex60_File.java
		
		//파일 & 디렉토리 조작
		//m1();
		//m2();
		
		//m3();
		//m4();
		//m5();
		
		//m6();
		//m7();
		//m8();
		
		//m9();
		
		//m10();
		m11();// = m10() //*****
		
		
	}

	private static void m11() {
		
		//m10()과 동일 -> 재귀 호출 구조
		int count = 0;
		
		File dir = new File("C:\\eclipse");
		
		count = getFiles(count, dir);
		
		System.out.printf("총 파일 갯수 : %,d개\n"
						, count);
	}

	private static int getFiles(int count, File dir) {
		
		if (dir.exists()) {
			
			File[] list = dir.listFiles();
			
			//파일 갯수
			for (File f : list) {
				if (f.isFile()) count++;
			}
			
			//자식 폴더 -> 똑같은 행동을 실행
			for (File d : list) {
				if (d.isDirectory()) {
					//재귀 호출
					count = getFiles(count, d);
				}
			}
			
		}//if
		
		return count;
		
	}//getFiles

	private static void m10() {
		
		//특정 폴더의 자식 파일 갯수?
		// - 파일 5,576, 폴더 1,545
		
		//누적변수
		int count = 0;
		
		File dir = new File("C:\\eclipse");
		
		if (dir.exists()) {
			
			File[] list = dir.listFiles();
			
			//eclipse
			for (File sub : list) {
				if (sub.isFile()) {
					count++;
				}
			}
			
			//eclipse의 자식 폴더
			for (File sub : list) {
				if (sub.isDirectory()) {
					
					File[] sublist = sub.listFiles();
					
					//자식 폴더의 파일 갯수 누적
					for (File dsub : sublist) {
						if (dsub.isFile()) {
							count++;
						}
					}
					
					for (File dsub : sublist) {
						if (dsub.isDirectory()) {
							
							//손자를 대상..
							File[] dsublist = dsub.listFiles();
							for (File ddsub : dsublist) {
								if (ddsub.isFile()) {
									count++;
								}
							}
							
							
						}
					}
					
				}
			}
			
			System.out.printf("총 파일 갯수 %d개\n"
							, count);
			
		}
		
	}

	private static void m9() {
		
		//디렉토리 내용 보기
		//	- 특정 디렉토리의 자식 폴더와 파일의 목록 얻어내기
		
		File dir = new File("C:\\eclipse");
		
		if (dir.exists()) {
			
			//자식들의 이름 배열
//			String[] list = dir.list();
//			
//			for (String str : list) {
//				System.out.println(str);
//			}
			
			//자식들의 객체 배열
//			File[] list = dir.listFiles();
//			
//			for (File f : list) {
//				System.out.println(f.getName());
//			}
			
			
			//윈도우 탐색기
			//	- 현재 폴더의 목록(폴더 -> 파일)
			File[] list = dir.listFiles();
			
			for (File d : list) {
				if (d.isDirectory()) {
					System.out.println(d.getName());
				}
			}
			System.out.println("-------------------");
			
			for (File f : list)	{
				if (f.isFile()) {
					System.out.println(f.getName());
				}
			}
			
		}
		
	}

	private static void m8() {
		
		//디렉토리 이동하기(이름 바꾸기)
		//File\AAA
		//File\BBB
		//File\AAA\CCC
		
		//A\C -> B\C 이동하기
		
		File dir = new File("D:\\Class\\File\\AAA\\CCC");
		
		if (dir.exists()) {
			
			File dir2 = new File("D:\\Class\\File\\BBB\\CCC");
			dir.renameTo(dir2);
			
			System.out.println("이동 완료");
			
		}
		
		
	}

	private static void m7() {
		
		//디렉토리 삭제하기
		File dir = new File("D:\\Class\\File\\BBB");
		
		if (dir.exists()) {
			
			//디렉토리의 내용물(파일,자식폴더)이 있으면 삭제 불가능
			if (dir.delete()) {//파일과 동일
				System.out.println("삭제 완료");
			} else {
				System.out.println("내용물때문에..");
			}
			
		}
		
	}

	private static void m6() {
		
		//디렉토리 만들기
		//D:\Class\File\CCC
		
		File dir = new File("D:\\Class\\File\\CCC");
		
		if (!dir.exists()) {
			dir.mkdir(); //make directory
			
			System.out.println("폴더 생성");
		}
		
		//2015-01-01 ~ 100일동안 폴더 생성
		Calendar c = Calendar.getInstance();
		c.set(2015, 0, 1);//2015-01-01
		
		for (int i=1; i<=100; i++) {
			String fName = String.format("%tF", c);
			File dir2 = new File("D:\\Class\\File\\" + fName);
			dir2.mkdir();
			
			c.add(Calendar.DATE, 1);
		}
		
		System.out.println("완료");
	}

	private static void m5() {
		
		//파일 삭제하기
		File file = new File("D:\\Class\\File\\BBB\\test.txt");
		
		if (file.exists()) {
			file.delete();
			
			System.out.println("삭제 완료~");
		}
		
	}

	private static void m4() {
		
		//파일명 수정하기(= 이동하기)
		//test.txt -> data.txt
		
		File file = new File("D:\\Class\\File\\AAA\\test.txt");
		
		if (file.exists()) {
			
			File file2 = new File("D:\\Class\\File\\BBB\\data.txt");
			file.renameTo(file2);
			
			System.out.println("이름 변경~");
			
		}
		
		
	}

	private static void m3() {
		
		//D:\\Class\\File\\AAA\\test.txt
		//D:\\Class\\File\\BBB
		
		//파일 이동하기(AAA -> BBB)
		// - 이동하려는 곳에 동일한 이름의 파일이 있으면 작업 불가능
		
		File file = new File("D:\\Class\\File\\AAA\\test.txt");
		
		if (file.exists()) {
			
			//file이 이동하고 난 뒤에 경로를 참조
			File file2 = new File("D:\\Class\\File\\BBB\\test.txt");
			
			if (file.renameTo(file2)) {
				 //파일 이동
				System.out.println("파일 이동 성공!!");
			} else {
				System.out.println("동일한 파일 존재O");
			}
			
			
		} else {
			System.out.println("옮길 파일 존재X");
		}
		
		
	}

	private static void m2() {
		
		//디렉토리 정보 읽기
		//1. 디렉토리 참조 객체 생성하기
		
		String path = "D:\\Class\\File";
		
		File dir = new File(path);
		
		if (dir.exists()) {
			
			System.out.println(dir.getName());
			System.out.println(dir.isFile());
			System.out.println(dir.isDirectory());
			System.out.println(dir.getPath());
			System.out.println(dir.getParent());
			System.out.println(dir.length());
			
		}
		
	}

	private static void m1() {
		
		//파일 정보 읽기
		//1. 파일 참조 객체 생성하기
		//2. 파일 객체를 통해 실제 파일을 제어
		
		String path = "D:\\Class\\File\\test.txt";
		
		File file = new File(path);
		
		//System.out.println(file.exists());
		if (file.exists()) {
			
			System.out.println(file.getName());//**
			System.out.println(file.isFile());//**
			System.out.println(file.isDirectory());//**
			System.out.println(file.lastModified());
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.isHidden());
			System.out.println(file.getPath());//**
			System.out.println(file.getAbsolutePath());//*
			System.out.println(file.length());//**
			
			
		} else {
			System.out.println("파일 없음");
		}
		
	}
}












