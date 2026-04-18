/*
	VARIABLES:

		Variables are nothing but a container which are used to store values.

		Syntax:-> dataType variableName;

		It is programmer's responsbility to provide variable name.

		If programmer is providing name then it is known as identifier

		While providing variable name it is recommand to follow camelCase convension

		First word of first character will be lower case and remaining word's first character will be uppercase.

		## Types of Variables:

			Their are two types of variable,

			1. Local Variable
			2. Globle Variable
				1. Static Variable
				2. Non-Static Variable


	EX:-> 

	String address;
	int age;
	String emailId;
	long mobileNumber;

		Onces we store values inside a variable then we can reuse that value based on their requirement.


	## How to strore value inside a container?

	variableName = value/variable/expression/condtions


*/

class VariableDemo {

	public static void main(String[] args) {

		String name;
		name = "Sudhir";
		System.out.println("Name: " + name);

		int id;
		id = 102;
		System.out.println("Id: " + id);

		double salary;
		salary = 600000.0;
		System.out.println("Salary: " + salary);

		int yearOfExp;
		yearOfExp = 10;
		System.out.println("Year of Exp: " + yearOfExp);

		String address;
		address = "Pune";
		System.out.println("Address: " + address);

		name = "Suraj";
		System.out.println(name);

	}

}