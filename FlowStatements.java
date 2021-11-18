package javabasics.com;

public class FlowStatements {

	public static void main(String[] args) {
		int age=23;
		if(age>=60) {
			System.out.println("eligible for Phase 1 of vaccine" +age);
		}
		else if(age>=40)
		{
			System.out.println("eligible for Phase 2 of vaccine" +age);
			}
		else if(age>=30) {
			System.out.println("eligible for Phase 3 of vaccine" +age);
		}
		else {
			System.out.println("eligible for Phase 4 of vaccine" +age);
		}

		int value=2;
		
		switch(value)
		{
		case 1:System.out.println("eligible for Phase 1 of vaccine" );
		case 2:System.out.println("eligible for Phase 2 of vaccine" );
		case 3:System.out.println("eligible for Phase 3 of vaccine" );
		break;
		case 4:System.out.println("eligible for Phase 4 of vaccine" );
		case 5:System.out.println("eligible for Phase 5 of vaccine" );
		case 6:System.out.println("eligible for Phase 6 of vaccine" );
		}
		
		int ravi=1;
		while(ravi<=10)
		{
			System.out.println("gayathri");
			ravi=ravi+1;
		}
		
	int X=1000;
	do {
		System.out.println("ravi1");
		X=X+1;
	}
	while(X<=10);
		
	}

}
