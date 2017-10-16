import java.io.IOException;
import java.util.Scanner;


public class EmployeeInfoApplication {

	public static void main(String[] args) throws IOException {
		try {
			EmployeeInfoManager.readAllEmployeeFromFile();
		    } catch (IOException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	    
	
	int a=0;
	int b=0;
	int c=0;
	int d=0;
       {
	while(a!=4)
	{
		Scanner sc =  new Scanner(System.in);
		Menu.showMainMenu();
		a=sc.nextInt();
		switch(a){
		case 1:{
			 Menu.showQueryMenu();	
			 b=sc.nextInt();
			 switch(b){
			 case 1:
				 EmployeeInfoManager.queryEmployeeByName(null);
				 break;
		     case 2:
		    	 EmployeeInfoManager.queryEmployeeByLevel(null);
		    	 break;
		     case 3:
		    	 EmployeeInfoManager.queryEmployeeByPosition(null);
		    	 break;
		     case 4:
		    	 EmployeeInfoManager.queryEmployeeByResearch(null);
		    	 break;	
		     case 5:
		    	 break;	
		     default:
					
					System.out.println("������������������1--5ѡ����Ӧ��ѯ��Ŀ");
					System.out.println("���������룺");
		               }break;
			 }
			 case 2:{
				 Menu.showAddMenu();
				 c=sc.nextInt();
				 switch(c){
				 case 1:
					 EmployeeInfoManager.addEmployee(null);
	  				 break;
				 case 2:
					 break;
				 default:
						System.out.println("������������������1--2ѡ����Ӧ��Ŀ");
						System.out.println("���������룺");
				          }break;
				      }
			 case 3:{
				 Menu.showUpdateMenu();
				 d=sc.nextInt();
				 switch(d){
				 case 1:
					 EmployeeInfoManager.UpdateEmployee();
	  				 break;
				 case 2:
					 break;
				                
			    default:
					System.out.println("������������������1--2ѡ����Ӧ��Ŀ");
					System.out.println("���������룺");  
			         }break;
			         }
			 case 4:{
				 System.out.println("�����˳�����л����ʹ��");
				 break;
			        }
			 default:
					System.out.println("������������������1--4ѡ����Ӧ��Ŀ");
					System.out.println("���������룺");
			 }
		   
	}
		}}}




