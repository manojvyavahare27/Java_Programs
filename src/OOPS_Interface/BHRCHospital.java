package OOPS_Interface;

public class BHRCHospital implements USMedical, UKMedical, IndianMedical {

	// USMedical
	@Override
	public void physioService() {
		System.out.println("USMedical....physioService");
	}

	@Override
	public void oncologyService() {
		System.out.println("USMedical....oncologyService");
	}

	@Override
	public void pediaService() {
		System.out.println("USMedical....pediaService");

	}

	// UKMedical
	@Override
	public void ENTService() {
		System.out.println("UKMedical....ENTService");

	}

	@Override
	public void DentalService() {
		System.out.println("UKMedical....DentalService");

	}

	// IndianMedical
	@Override
	public void gynoService() {
		System.out.println("IndianMedical....gynoService");

	}

	@Override
	public void orthoService() {
		System.out.println("IndianMedical....gynoService");

	}

	// Comman Methods from Interface
	@Override
	public void emergency() {
		// TODO Auto-generated method stub

	}

	//Individual Method of BHRC class
	public void MedicalInsurance()
	{
		System.out.println("Individual Method....MedicalInsurance");

	}
	
	//Changes after 1.8 JDK
	//Static method can not be override
	public static void billing()
	{
		System.out.println("BHRC...Billing");
	}
	
	public void RnD()
	{
		System.out.println("USMedical...RnD");
	}

	@Override
	public void CovidVaccination() {
    System.out.println("Covid Vaccination.");		
	}

}
