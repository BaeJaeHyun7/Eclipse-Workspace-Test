import java.util.InputMismatchException;
import java.util.Scanner;

public class SchoolUI {
	
	SchoolManager sm = new SchoolManager();
	Scanner sc = new Scanner(System.in);
	
	public void printMainMenu() {
		System.out.println("=================");
		System.out.println("|| 직원 관리 시스템 ||");
		System.out.println("=================");
		System.out.println("1. 등록");
		System.out.println("2. 전체 출력");
		System.out.println("0. 종료");
		System.out.println("=================");
		System.out.println("메뉴 선택=>");
	}
	
	public void printInsertHumanMenu() {
		System.out.println("============");
		System.out.println("|| 등록 메뉴 ||");
		System.out.println("============");
		System.out.println("1. 학생");
		System.out.println("2. 직원");
		System.out.println("3. 교수");
		System.out.println("0. 상위 메뉴");
		System.out.println("=============");
		System.out.println("메뉴 선택=>");
	}
	
	public void printAll() {
		sm.printAll();
	}
	
	public boolean insertStudent() {
		sc.nextLine();
		System.out.println("============");
		System.out.println("|| 학생 등록 ||");
		System.out.println("============");
		
		try {
			System.out.print("이름 : ");
			String inputName = sc.nextLine();
			System.out.print("나이 : ");
			int inputAge = sc.nextInt();
			sc.nextLine();
			System.out.print("주민번호 : ");
			String inputSn = sc.nextLine();
			System.out.print("학번 : ");
			String inputSsn = sc.nextLine();
			
			Student student = new Student(inputSn, inputName, inputAge, inputSsn);
			return sm.insertHuman(student);
		} catch (InputMismatchException e) {
			System.out.println("잘못된 입력");
			return false;
		}			
	}
	
	public boolean insertStaff() {
		sc.nextLine();
		System.out.println("============");
		System.out.println("|| 직원 등록 ||");
		System.out.println("============");
		
		try {
			System.out.print("이름 : ");
			String inputName = sc.nextLine();
			System.out.print("나이 : ");
			int inputAge = sc.nextInt();
			sc.nextLine();
			System.out.print("주민번호 : ");
			String inputSn = sc.nextLine();
			System.out.print("부서 : ");
			String inputField = sc.nextLine();
			
			Staff staff = new Staff(inputSn, inputName, inputAge, inputField);
			return sm.insertHuman(staff);
		} catch (InputMismatchException e) {
			System.out.println("잘못된 입력");
			return false;
		}		
	}
	
	public boolean insertProfessor() {
		sc.nextLine();
		System.out.println("============");
		System.out.println("|| 교수 등록 ||");
		System.out.println("============");
		
		try {
			System.out.print("이름 : ");
			String inputName = sc.nextLine();
			System.out.print("나이 : ");
			int inputAge = sc.nextInt();
			sc.nextLine();
			System.out.print("주민번호 : ");
			String inputSn = sc.nextLine();
			System.out.print("전공 : ");
			String inputMajor = sc.nextLine();
			
			Professor professor = new Professor(inputSn, inputName, inputAge, inputMajor);
			return sm.insertHuman(professor);
		} catch (InputMismatchException e) {
			System.out.println("잘못된 입력");
			return false;
		}		
	}
	
	public void insertHuman() {
		boolean result = false;
		while(true) {
			printInsertHumanMenu();
			
			try {
				int choice = sc.nextInt();
				
				switch (choice) {
				case 1 : result = insertStudent();
				         if(result) System.out.println("정상등록완료");
				         else System.out.println("등록 오류");
					
					break;
					
				case 2 : result = insertStaff(); 
						 if(result) System.out.println("정상등록완료");
						 else System.out.println("등록 오류");
					break;
					
				case 3 : result = insertProfessor(); 
						 if(result) System.out.println("정상등록완료");
						 else System.out.println("등록 오류");
		
					break;
		
				case 0 :
		
					return;

				default : System.out.println("잘못된 입력");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력해주세요");
			}
			
		}
		
	}
	
	public boolean deleteHuman() {
		sc.nextLine();
		System.out.println("============");
		System.out.println("|| 객체 삭제 ||");
		System.out.println("============");
		System.out.println("주민번호 입력 : ");
		String inputSn = sc.nextLine();
		Human h = sm.findHuman(inputSn);
		if(h == null) return false;
		else return sm.deleteHuman(h);
	}
	
	public Human findHuman() {
		sc.nextLine();
		System.out.println("============");
		System.out.println("|| 객체 찾기 ||");
		System.out.println("============");
		System.out.println("주민번호 입력 : ");
		String inputSn = sc.nextLine();
		
		return sm.findHuman(inputSn);
	}	
	
public void exec() {
		
		while(true) {
			printMainMenu();
			
			try {
				int choice = sc.nextInt();
				
				switch (choice) {
				case 1 : insertHuman();
					
					break;
				
				case 2 : Human h = findHuman();
				         if(h != null) h.print();
				         else System.out.println("일치하는 정보 없음");
				break;
				
				case 3 : boolean result = deleteHuman();
						 if(result) System.out.println("삭제 성공");
						 else System.out.println("삭제 실패");
				
				break;
					
				case 4 : printAll(); 
					
					break;
				
				case 0 :
		
					return;

				default : System.out.println("잘못된 입력");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력해주세요");
			}
			
		}
		
	}

}
