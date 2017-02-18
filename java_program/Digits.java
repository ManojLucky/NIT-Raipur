//this is digits program
/* 
auther:Suraj Gupta  
Raipur india
*/

import java.util.Scanner;
class Digits{
	public static void main(String args[]){
		int disit_Take;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number:-");
		disit_Take=in.nextInt();
		int temp_Var=disit_Take;
					//three digit
					if(disit_Take > 99 && disit_Take < 1000 ){
							System.out.println("::Number is THREE digits:: ");
							System.out.println("---------------------------");
							System.out.print("|");

							int d3= disit_Take%10;
								disit_Take = disit_Take/10;
							int d2=disit_Take%10;
								disit_Take = disit_Take/10;
							int d1=disit_Take%10;
								if(d1<10){
											switch(d1){
												case 1:
												System.out.print("One thousand");
												break;
												case 2:
												System.out.print("Two thousand");
												break;
												case 3:
												System.out.print("Three thousand");
												break;
												case 4:
												System.out.print("Four thousand");
												break;
												case 5:
												System.out.print("Five thousand");
												break;
												case 6:
												System.out.print("Six thousand");
												break;
												case 7:
												System.out.print("Seven thousand");
												break;
												case 8:
												System.out.print("Eight thousand");
												break;
												case 9:
												System.out.print("Nine thousand");
												break;
											}
									}
									if(d2==1){
												d2=d2*10;
												d2=d2+d3;
												switch(d2){
												case 10:
												System.out.print(" Ten");
												break;
												case 11:
												System.out.print(" Eleven");
												break;
												case 12:
												System.out.print(" Twelfth");
												break;
												case 13:
												System.out.print(" Thirteen");
												break;
												case 14:
												System.out.print(" Fourteen");
												break;
												case 15:
												System.out.print(" Fifteen");
												break;
												case 16:
												System.out.print(" Sixteen");
												break;
												case 17:
												System.out.print(" Seventeen");
												break;
												case 18:
												System.out.print(" Eighteen");
												break;
												case 19:
												System.out.print(" Nineteen");
												break;
												}
									}else{
											if(d2<10){
													switch(d2){
														
														case 2:
														System.out.print(" Twenty");
														break;
														case 3:
														System.out.print(" Thirty");
														break;
														case 4:
														System.out.print(" Fourty");
														break;
														case 5:
														System.out.print(" Fifty");
														break;
														case 6:
														System.out.print(" Sixty");
														break;
														case 7:
														System.out.print(" Seventy");
														break;
														case 8:
														System.out.print(" Eigty");
														break;
														case 9:
														System.out.print(" Ninety");
														break;
													}
												}
														
											if(d3<10){
														switch(d3){
														case 1:
														System.out.print(" One");
														break;
														case 2:
														System.out.print(" Two");
														break;
														case 3:
														System.out.print(" Three");
														break;
														case 4:
														System.out.print(" Four");
														break;
														case 5:
														System.out.print(" Five");
														break;
														case 6:
														System.out.print(" Six");
														break;
														case 7:
														System.out.print(" Seven");
														break;
														case 8:
														System.out.print(" Eight");
														break;
														case 9:
														System.out.print(" Nine");
														break;
													}

											}
								    }
								System.out.print("|");
								System.out.println("\n---------------------------");

					}/*end of three digit*/
					else if(disit_Take >9 && disit_Take <100){
						System.out.println("::Number is TWO digits:: ");
						System.out.println("--------------");
						System.out.print("|");
						
						int	d3=disit_Take%10;
						disit_Take=disit_Take/10;
						int d2 =disit_Take%10;
						disit_Take=disit_Take/10;
						
								if(d2==1){
												d2=d2*10;
												d2=d2+d3;
												switch(d2){
												case 10:
												System.out.print(" Ten");
												break;
												case 11:
												System.out.print(" Elevan");
												break;
												case 12:
												System.out.print(" Twelve");
												break;
												case 13:
												System.out.print(" Thirteen");
												break;
												case 14:
												System.out.print(" Fourteen");
												break;
												case 15:
												System.out.print(" Fifteen");
												break;
												case 16:
												System.out.print(" Sixteen");
												break;
												case 17:
												System.out.print(" Seventeen");
												break;
												case 18:
												System.out.print(" Eighteen");
												break;
												case 19:
												System.out.print(" Nineteen");
												break;
												}
								}else{
											if(d2<10){
													switch(d2){
														
														case 2:
														System.out.print(" Twenty");
														break;
														case 3:
														System.out.print(" Thirty");
														break;
														case 4:
														System.out.print(" Fouty");
														break;
														case 5:
														System.out.print(" Fifty");
														break;
														case 6:
														System.out.print(" Sixty");
														break;
														case 7:
														System.out.print(" Seventy");
														break;
														case 8:
														System.out.print(" Eighy");
														break;
														case 9:
														System.out.print(" Ninghty");
														break;
													}
											}
														
											if(d3<10){
													switch(d3){
														case 1:
														System.out.print(" One");
														break;
														case 2:
														System.out.print(" Two");
														break;
														case 3:
														System.out.print(" Three");
														break;
														case 4:
														System.out.print(" Four");
														break;
														case 5:
														System.out.print(" Five");
														break;
														case 6:
														System.out.print(" Six");
														break;
														case 7:
														System.out.print(" Seven");
														break;
														case 8:
														System.out.print(" Eight");
														break;
														case 9:
														System.out.print(" Nine");
														break;
													}

											}
									}		
									System.out.print("|");
						System.out.println("\n--------------");
					
					}//two digits
					else if(disit_Take<10){
							System.out.println("::Number is ONE digits::");
							System.out.println("-------");
							System.out.print("|");

								disit_Take=disit_Take%10;
								switch(disit_Take){
									case 1:
									System.out.print(" One");
									break;
									case 2:
									System.out.print(" Two");
									break;
									case 3:
									System.out.print(" Three");
									break;
									case 4:
									System.out.print(" Four");
									break;
									case 5:
									System.out.print(" Five");
									break;
									case 6:
									System.out.print(" Six");
									break;
									case 7:
									System.out.print(" Seven");
									break;
									case 8:
									System.out.print(" Eight");
									break;
									case 9:
									System.out.print(" Nine");
									break;
								}
								System.out.print(" |");
								System.out.println("\n-------");
						}//end of one digit
						else{
								System.out.println("------------------------");
								System.out.print("|");
								System.out.print(" SORRY! Out of Covrage");
								System.out.println("|");
								System.out.println("------------------------");
						}
								
										

						
						
						
						
		
		
	}


}//End of program


