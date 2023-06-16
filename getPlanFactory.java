package Work;

public class getPlanFactory {
   public plan getPlan(String str)
   {
	   if(str==null) //ABC
		   
	   return null;
	   else if(str.equalsIgnoreCase("domestic plan"))
		   return new Domestic();
	   else if(str.equalsIgnoreCase("commercialplan"))
		   return new CommercialPlan();
	   else if(str.equalsIgnoreCase("institutional plan"))
		   return new InstitutionalPlan();
	   else
		   return null;
	   
	   
   }
}
