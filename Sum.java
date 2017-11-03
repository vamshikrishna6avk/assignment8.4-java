package commandline;//created package as commandline
/*
 * here we are making a program for taking input from the command line 
 * and convert it into integer
 * here we are creating the class Sum
 */
public class Sum {
//here we are creating the main Method
	//classes are basics of opps(object oriented programming)
	public static void main(String[] args) {
		//here we are taking the integer value
		//Here public is a access modifier which defines who can access this method
		//Here static a keyword which identifies class related thing
		//void is used to define return type of the method,void means method wont return any value
		//main is name of method
		//declares method String[]
		//String[]args means arguments will be passed into main method and says that main() as a parameter
        int sum = 25;
      //here loop will run till the number of times specified in command line
        for (int i = 0; i < args.length; i++) {
        	//here we are applying the parse int method for converting the argument into the String
            sum = sum + Integer.parseInt(args[i]);
        }
        System.out.println("The sum of the arguments passed is " + sum);//system is used to return code
        //out is a static member
      	//Println is used to print text  and gives output 
    }
}