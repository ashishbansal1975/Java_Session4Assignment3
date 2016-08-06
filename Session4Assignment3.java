public class Session4Assignment3
  {
	
	private String employeeName;	
	private String designation;
			
	
        public String getEmployeeName() 
        {
		return employeeName;
	}
	
	  
       public String getDesignation() 
         {
		return designation;
	 }


      public void setEmployeeName(String newemployeeName)
        {
		employeeName = newemployeeName;
	}

       public void setDesignation(String newdesignation) 
        {
		designation = newdesignation;
	}
   		


   public static void main(String [] args) 
       {
            Session4Assignment3 obj1 = new Session4Assignment3();
            Session4Assignment3 obj2 = new Session4Assignment3();
                    
            obj1.setEmployeeName("Deepak Sharma");
            obj1.setDesignation("Assistant Manager");

            
            obj2.setEmployeeName("Jitesh Rohtagi");
            obj2.setDesignation("Office Assistant");

            System.out.println("The Details of the first employee is : ");            
            System.out.println("Employee Name: " + obj1.getEmployeeName());
            System.out.println("Employee Designation: " + obj1.getDesignation());

            System.out.println("The Details of the second employee is : ");            
            System.out.println("Employee Name: " + obj2.getEmployeeName());
            System.out.println("Employee Designation: " + obj2.getDesignation());
    } 
}