
/**
 * Write a description of WordLength here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
public class WordLength {

 public void countwordlength(FileResource resource, int[] counts)
 {    int k = 0;
    for(String word : resource.words())
          
          {   
              String newword = null;
            StringBuilder sb = new StringBuilder(word); 
                 for(int i = 0; i< word.length(); i++){
                 
                     char currchar = sb.charAt(i);   
                     if(Character.isLetter(currchar))
                 {  
                     newword = newword + currchar;
                   
                    
                  }  
                }  
                      int length = newword.length();
                     
                      k = k + 1;
                      counts[k] = length - 4;
                     
               System.out.println("The length of the word present at the  location  " + k + " length is "  + counts[k]);
                 
     }    
     
    }    
    public void indexofmax(int[] counts)
    {
                 int k = 0;
                 FileResource resource = new FileResource("data/common.txt");
                 int[] maxlength = new int[14]; 
                 int n = 0;
                 int a =1;
    for(String word : resource.words())
          
          {   
              String newword = null;
            StringBuilder sb = new StringBuilder(word); 
                 for(int i = 0; i< word.length(); i++)
                 {
                 
                     char currchar = sb.charAt(i);   
                     if(Character.isLetter(currchar))
                 {  
                     newword = newword + currchar;
                   
                    
                  }  
                }  
                      int length = newword.length() - 4;
                     
                      
                     
                       if(newword.length()-4 == 1)
                      {   
                          maxlength[1] += 1;
                         
                        }
                    
                   
                        
                         if(newword.length()-4 == 1)
                      {   
                          maxlength[1] += 1;
                         
                        }
                        
                         if(newword.length()-4 == 2)
                      {   
                          maxlength[2] += 1;
                         
                        }
                        
                         if(newword.length()-4 == 3)
                      {   
                          maxlength[3] += 1;
                         
                        }
                        
                         if(newword.length()-4 == 4)
                      {   
                          maxlength[4] += 1;
                         
                        }
                        
                         if(newword.length()-4== 5)
                      {   
                          maxlength[5] += 1;
                         
                        }
                        
                         if(newword.length()-4 == 6)
                      {   
                          maxlength[6] += 1;
                         
                        }
                        
                         if(newword.length()-4 == 7)
                      {   
                          maxlength[7] += 1;
                         
                        }
                        
                         if(newword.length()-4 == 8)
                      {   
                          maxlength[8] += 1;
                         
                        }
                        
                         if(newword.length()-4 == 9)
                      {   
                          maxlength[9] += 1;
                         
                        }
                        
                         if(newword.length()-4 == 10)
                      {   
                          maxlength[10] += 1;
                         
                        }
                        
                         if(newword.length()-4 == 11)
                      {   
                          maxlength[11] += 1;
                         
                        }
                        
                         if(newword.length()-4 == 12)
                      {   
                          maxlength[12] += 1;
                         
                        }
                        
                         if(newword.length()-4 == 13)
                      {   
                          maxlength[13] += 1;
                         
                        }
                    }
                         
                     for(int i = 1; i<= maxlength.length-1; i++)   
                       { 
                        if(maxlength[i] >= a)
                        
                        {
                           a = maxlength[i];
                            n = i;
                        
                        
                        }
                    
                    } 
                    System.out.println("the maximum word of the same length are " + n );
                   
    
                }
        
            
    
    
    
    
    public void testcountwordlength()
    {
          FileResource resource = new FileResource("data/common.txt");
          int k = 0;
          for(String word : resource.words())
          {
                k = k +1;
        
        }
    
        int[] counts = new int[k + 1];
        
        countwordlength(resource, counts);
        indexofmax(counts);
        
    }
    
 }
