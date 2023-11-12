package OOPS_Interface;

public class TestHospital {

	public static void main(String[] args) {
      BHRCHospital bhrc=new BHRCHospital();
      //USMedical
      System.out.println("USMedical Services");
      bhrc.physioService();
      bhrc.oncologyService();
      bhrc.pediaService();
      //UKMedical
      System.out.println("UKMedical Services");
      bhrc.ENTService();
      bhrc.DentalService();
      //IndianMedical
      System.out.println("IndianMedical Services");
      bhrc.gynoService();
      bhrc.orthoService();
      bhrc.emergency();
      
      //Individual Method
      bhrc.MedicalInsurance();
      
      //Static method calling with interface name or class name
      USMedical.billing();
      bhrc.billing();
      bhrc.CovidVaccination();         
      
      //Top Casting
      USMedical us=new BHRCHospital();
      us.physioService();
      us.oncologyService();
      us.pediaService();
      us.emergency();              
    		  
	}
}
