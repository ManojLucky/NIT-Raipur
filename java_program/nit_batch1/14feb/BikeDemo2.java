
/* 
Auther: surendra kuamr  sao
S/W Architech & Corporate s/w Trainer
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G)
*/

class  BikeDemo2{
	public static void  main(String args[]) throws Exception{
		
		
		
		Bike vijayBike = null;
		Bike bike2 = null;
		System.out.println(vijayBike);
		System.out.println(bike2);
		System.out.println("-------------");
		vijayBike = new Bike();
		bike2 = new Bike();
		System.out.println(vijayBike);
		System.out.println(bike2);
		
		System.out.println("Vijay's Bike details");
		
		//how to get variable value form object 
		//usint objRef.varaibleName
		System.out.println(vijayBike.name);
		System.out.println(vijayBike.brandName);
		System.out.println(vijayBike.modelNumber);
		System.out.println(vijayBike.regestrationNumber);
		System.out.println(vijayBike.numberOfScilencer);
		System.out.println(vijayBike.totalGears);
		System.out.println(vijayBike.totalTraveledDistanceInKm);
		System.out.println(vijayBike.totalTraveledDistanceInMeter);
		System.out.println(vijayBike.isRunningCondition);
		System.out.println(vijayBike.userSign);
		
		//how to set property/instance/object variable
		//obj.varaibleName=value;
		vijayBike.name = "Pulsur";
		vijayBike.brandName = "bajaj";
		vijayBike.modelNumber = "24324fff";
		vijayBike.regestrationNumber = "cg845";
		vijayBike.numberOfScilencer = 1;
		vijayBike.totalGears = 5;
		vijayBike.totalTraveledDistanceInKm = 0;
		
		for(int i=1; i<=10;i++){
			Thread.sleep(1000);
			System.out.print("total run in km : ");
			System.out.println(vijayBike.totalTraveledDistanceInKm);
			vijayBike.totalTraveledDistanceInKm++;
		}
		
		//vijayBike.totalTraveledDistanceInKm = 0;
		
		
		vijayBike.totalTraveledDistanceInMeter = 0;
		vijayBike.isRunningCondition = true;
		vijayBike.userSign ='$';
		
		
		System.out.println("after setting values");
		System.out.println("Vijay's Bike details");
		
		System.out.println(vijayBike.name);
		System.out.println(vijayBike.brandName);
		System.out.println(vijayBike.modelNumber);
		System.out.println(vijayBike.regestrationNumber);
		System.out.println(vijayBike.numberOfScilencer);
		System.out.println(vijayBike.totalGears);
		System.out.println(vijayBike.totalTraveledDistanceInKm);
		System.out.println(vijayBike.totalTraveledDistanceInMeter);
		System.out.println(vijayBike.isRunningCondition);
		System.out.println(vijayBike.userSign);
		
		
		
	}//main

}//class