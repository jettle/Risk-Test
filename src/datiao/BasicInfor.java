package datiao;

import java.io.*;
import jxl.Sheet;
import jxl.Workbook;

public class BasicInfor {
	
	public static String sex="��";
	public static int age=21;
	public static String fell="����";
	public static String city="һ�߳���";
	
	public static double getbasicDate(String sex,int age,String fell,String city) {
		// TODO Auto-generated method stub
		String datasex = "";
		String dataage = "";
		String datafell = "";
		String datacity = "";
		
		File file = new File("e:\\�����ʾ�.xls");  
		InputStream in;
		try {
			in = new FileInputStream(file);
			Workbook workbook = Workbook.getWorkbook(in);  
			//��ȡ��һ��Sheet��  
		    Sheet sheet = workbook.getSheet(0);  
		    
		    	 if (sex.equals("��")) {
					  datasex = sheet.getCell(1,1).getContents();
					  if (age<18) {
						   dataage = sheet.getCell(1,3).getContents();
						  if (fell.equals("����")) {
						      datafell = sheet.getCell(1,7).getContents();
							  if (city.equals("һ�߳���")) {
								  datacity = sheet.getCell(1,11).getContents();
						   }else if (city.equals("���߳���")) {
							      datacity = sheet.getCell(1,12).getContents();
						}else if (city.equals("���߳���")) {
						      datacity = sheet.getCell(1,13).getContents();
					    }
					   }
					   
					   else if (fell.equals("����")) {
						 datafell = sheet.getCell(1,8).getContents();
						 if (city.equals("һ�߳���")) {
							  datacity = sheet.getCell(1,11).getContents();
					   }else if (city.equals("���߳���")) {
						      datacity = sheet.getCell(1,12).getContents();
					}else if (city.equals("���߳���")) {
					      datacity = sheet.getCell(1,13).getContents();
				    }   
					   }else if (fell.equals("�侲")) {
						 datafell = sheet.getCell(1,9).getContents();
						 if (city.equals("һ�߳���")) {
							  datacity = sheet.getCell(1,11).getContents();
					   }else if (city.equals("���߳���")) {
						      datacity = sheet.getCell(1,12).getContents();
					}else if (city.equals("���߳���")) {
					      datacity = sheet.getCell(1,13).getContents();
				    }
					   }
					  }
				    else if(age>=18||age<=20){
						   dataage = sheet.getCell(1,4).getContents();
						   if(fell.equals("����")) {
							      datafell = sheet.getCell(1,7).getContents();
								  if (city.equals("һ�߳���")) {
									  datacity = sheet.getCell(1,11).getContents();
							   }else if (city.equals("���߳���")) {
								      datacity = sheet.getCell(1,12).getContents();
							}else if (city.equals("���߳���")) {
							      datacity = sheet.getCell(1,13).getContents();
						    }
						   }
						   else if (fell.equals("����")) {
							 datafell = sheet.getCell(1,8).getContents();
							 if (city.equals("һ�߳���")) {
								  datacity = sheet.getCell(1,11).getContents();
						   }else if (city.equals("���߳���")) {
							      datacity = sheet.getCell(1,12).getContents();
						}else if (city.equals("���߳���")) {
						      datacity = sheet.getCell(1,13).getContents();
					    }
						   }else if (fell.equals("�侲")) {
							 datafell = sheet.getCell(1,9).getContents();
							 if (city.equals("һ�߳���")) {
								  datacity = sheet.getCell(1,11).getContents();
						   }else if (city.equals("���߳���")) {
							      datacity = sheet.getCell(1,12).getContents();
						}else if (city.equals("���߳���")) {
						      datacity = sheet.getCell(1,13).getContents();
					    }
						   }
				    }
					 else if(age>=21||age<=22){
						   dataage = sheet.getCell(1,5).getContents();
						   if(fell.equals("����")) {
							      datafell = sheet.getCell(1,7).getContents();
								  if (city.equals("һ�߳���")) {
									  datacity = sheet.getCell(1,11).getContents();
							   }else if (city.equals("���߳���")) {
								      datacity = sheet.getCell(1,12).getContents();
							}else if (city.equals("���߳���")) {
							      datacity = sheet.getCell(1,13).getContents();
						    }
						   }
						   else if (fell.equals("����")) {
							 datafell = sheet.getCell(1,8).getContents();
							 if (city.equals("һ�߳���")) {
								  datacity = sheet.getCell(1,11).getContents();
						   }else if (city.equals("���߳���")) {
							      datacity = sheet.getCell(1,12).getContents();
						}else if (city.equals("���߳���")) {
						      datacity = sheet.getCell(1,13).getContents();
					    }
						   }else if (fell.equals("�侲")) {
							 datafell = sheet.getCell(1,9).getContents();
							 if (city.equals("һ�߳���")) {
								  datacity = sheet.getCell(1,11).getContents();
						   }else if (city.equals("���߳���")) {
							      datacity = sheet.getCell(1,12).getContents();
						}else if (city.equals("���߳���")) {
						      datacity = sheet.getCell(1,13).getContents();
					    }
						   }
					 }
					 else if (age>=23) {
						   dataage = sheet.getCell(1,6).getContents();
						   if(fell.equals("����")) {
							      datafell = sheet.getCell(1,7).getContents();
								  if (city.equals("һ�߳���")) {
									  datacity = sheet.getCell(1,11).getContents();
							   }else if (city.equals("���߳���")) {
								      datacity = sheet.getCell(1,12).getContents();
							}else if (city.equals("���߳���")) {
							      datacity = sheet.getCell(1,13).getContents();
						    }
						   
						   }else if (fell.equals("����")) {
							 datafell = sheet.getCell(1,8).getContents();
							 if (city.equals("һ�߳���")) {
								  datacity = sheet.getCell(1,11).getContents();
						   }else if (city.equals("���߳���")) {
							      datacity = sheet.getCell(1,12).getContents();
						}else if (city.equals("���߳���")) {
						      datacity = sheet.getCell(1,13).getContents();
					    }
						   }else if (fell.equals("�侲")) {
							 datafell = sheet.getCell(1,9).getContents();
							 if (city.equals("һ�߳���")) {
								  datacity = sheet.getCell(1,11).getContents();
						   }else if (city.equals("���߳���")) {
							      datacity = sheet.getCell(1,12).getContents();
						}else if (city.equals("���߳���")) {
						      datacity = sheet.getCell(1,13).getContents();
					    }
						   }
					 }
		    	 }
			    else if(sex.equals("Ů")){
			    	datasex  = sheet.getCell(1,2).getContents();
			    	
			    	if(age<18) {
						   dataage = sheet.getCell(1,3).getContents();
						  if (fell.equals("����")) {
						      datafell = sheet.getCell(1,7).getContents();
							  if (city.equals("һ�߳���")) {
								  datacity = sheet.getCell(1,11).getContents();
						   }else if (city.equals("���߳���")) {
							      datacity = sheet.getCell(1,12).getContents();
						}else if (city.equals("���߳���")) {
						      datacity = sheet.getCell(1,13).getContents();
					    }
					   }
					   
					   else if (fell.equals("����")) {
						 datafell = sheet.getCell(1,8).getContents();
						 if (city.equals("һ�߳���")) {
							  datacity = sheet.getCell(1,11).getContents();
					   }else if (city.equals("���߳���")) {
						      datacity = sheet.getCell(1,12).getContents();
					}else if (city.equals("���߳���")) {
					      datacity = sheet.getCell(1,13).getContents();
				    }   
					   }else if (fell.equals("�侲")) {
						 datafell = sheet.getCell(1,9).getContents();
						 if (city.equals("һ�߳���")) {
							  datacity = sheet.getCell(1,11).getContents();
					   }else if (city.equals("���߳���")) {
						      datacity = sheet.getCell(1,12).getContents();
					}else if (city.equals("���߳���")) {
					      datacity = sheet.getCell(1,13).getContents();
				    }
					   }
					  }
				    else if(age>=18||age<=20){
						   dataage = sheet.getCell(1,4).getContents();
						   if(fell.equals("����")) {
							      datafell = sheet.getCell(1,7).getContents();
								  if (city.equals("һ�߳���")) {
									  datacity = sheet.getCell(1,11).getContents();
							   }else if (city.equals("���߳���")) {
								      datacity = sheet.getCell(1,12).getContents();
							}else if (city.equals("���߳���")) {
							      datacity = sheet.getCell(1,13).getContents();
						    }
						   }
						   else if (fell.equals("����")) {
							 datafell = sheet.getCell(1,8).getContents();
							 if (city.equals("һ�߳���")) {
								  datacity = sheet.getCell(1,11).getContents();
						   }else if (city.equals("���߳���")) {
							      datacity = sheet.getCell(1,12).getContents();
						}else if (city.equals("���߳���")) {
						      datacity = sheet.getCell(1,13).getContents();
					    }
						   }else if (fell.equals("�侲")) {
							 datafell = sheet.getCell(1,9).getContents();
							 if (city.equals("һ�߳���")) {
								  datacity = sheet.getCell(1,11).getContents();
						   }else if (city.equals("���߳���")) {
							      datacity = sheet.getCell(1,12).getContents();
						}else if (city.equals("���߳���")) {
						      datacity = sheet.getCell(1,13).getContents();
					    }
						   }
				    }
					 else if(age>=21||age<=22){
						   dataage = sheet.getCell(1,5).getContents();
						   if(fell.equals("����")) {
							      datafell = sheet.getCell(1,7).getContents();
								  if (city.equals("һ�߳���")) {
									  datacity = sheet.getCell(1,11).getContents();
							   }else if (city.equals("���߳���")) {
								      datacity = sheet.getCell(1,12).getContents();
							}else if (city.equals("���߳���")) {
							      datacity = sheet.getCell(1,13).getContents();
						    }
						   }
						   else if (fell.equals("����")) {
							 datafell = sheet.getCell(1,8).getContents();
							 if (city.equals("һ�߳���")) {
								  datacity = sheet.getCell(1,11).getContents();
						   }else if (city.equals("���߳���")) {
							      datacity = sheet.getCell(1,12).getContents();
						}else if (city.equals("���߳���")) {
						      datacity = sheet.getCell(1,13).getContents();
					    }
						   }else if (fell.equals("�侲")) {
							 datafell = sheet.getCell(1,9).getContents();
							 if (city.equals("һ�߳���")) {
								  datacity = sheet.getCell(1,11).getContents();
						   }else if (city.equals("���߳���")) {
							      datacity = sheet.getCell(1,12).getContents();
						}else if (city.equals("���߳���")) {
						      datacity = sheet.getCell(1,13).getContents();
					    }
						   }
					 }
					 else if (age>=23) {
						   dataage = sheet.getCell(1,6).getContents();
						   if(fell.equals("����")) {
							      datafell = sheet.getCell(1,7).getContents();
								  if (city.equals("һ�߳���")) {
									  datacity = sheet.getCell(1,11).getContents();
							   }else if (city.equals("���߳���")) {
								      datacity = sheet.getCell(1,12).getContents();
							}else if (city.equals("���߳���")) {
							      datacity = sheet.getCell(1,13).getContents();
						    }
						   
						   }else if (fell.equals("����")) {
							 datafell = sheet.getCell(1,8).getContents();
							 if (city.equals("һ�߳���")) {
								  datacity = sheet.getCell(1,11).getContents();
						   }else if (city.equals("���߳���")) {
							      datacity = sheet.getCell(1,12).getContents();
						}else if (city.equals("���߳���")) {
						      datacity = sheet.getCell(1,13).getContents();
					    }
						   }else if (fell.equals("�侲")) {
							 datafell = sheet.getCell(1,9).getContents();
							 if (city.equals("һ�߳���")) {
								  datacity = sheet.getCell(1,11).getContents();
						   }else if (city.equals("���߳���")) {
							      datacity = sheet.getCell(1,12).getContents();
						}else if (city.equals("���߳���")) {
						      datacity = sheet.getCell(1,13).getContents();
					    }
						   }
					 }
			    }
			    /*
				//ѭ�����е���ʽ����������е�����
			    for (int i = 1; i < sheet.getRows(); i++) {
			    	for (int j = 0; j < sheet.getColumns(); j++) {
			    		
						//��ȡ��Ԫ��
			    		Cell cell2 = sheet.getCell(j,i);//ע�⣺getCell(Clomuns,Rows)���������������������С�
			    		String string = cell2.getContents();
			            System.out.println(string);
					}
				}
				*/
			
			    workbook.close(); 
			    in.close();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		
//		System.out.println("yi:"+datasex);
//		System.out.println(datasex.substring(1,datasex.indexOf("%")));
		double result1=Double.parseDouble(datasex.substring(0,datasex.indexOf("%")))/100;
		double result2=Double.parseDouble(dataage.substring(0,dataage.indexOf("%")))/100;
		double result3=Double.parseDouble(datafell.substring(0,datafell.indexOf("%")))/100;
		double result4=Double.parseDouble(datacity.substring(0,datacity.indexOf("%")))/100;
//		System.out.println(result1);
//		System.out.println(result2);
//		System.out.println(result3);
//		System.out.println(result4);
		
		return result1*result2*result3*result4;
//		return 0;
	}

	
}
