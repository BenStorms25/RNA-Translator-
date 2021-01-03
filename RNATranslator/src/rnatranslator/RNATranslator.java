/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rnatranslator;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class RNATranslator {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a RNA sequence in all caps with no spaces in between: ");
        String fullSequence = keyboard.nextLine();
        if(fullSequence.length() % 3 != 0){
            System.out.println("Error: RNA sequence must be divisible by 3.  Type again:");
            fullSequence = keyboard.nextLine();
        }
        Translator(dataCollection(fullSequence));
        
        
    }
    public static ArrayList dataCollection(String sequence){
        ArrayList<String> letterList = new ArrayList<String>();
        int startIndex = sequence.indexOf("AUG") + 3;
        for(int i  = startIndex; i < sequence.length(); i++){
            String letter = String.valueOf(sequence.charAt(i));
            letterList.add(letter);
            
        }
        ArrayList<String> codonList = new ArrayList<String>();
        for(int i = 0; i < letterList.size(); i = i + 3 ){
            String newElement = letterList.get(i) + letterList.get(i + 1) + letterList.get(i + 2);
            codonList.add(newElement);
        }
        System.out.println(codonList);
        return codonList;
    }
    
    public static void Translator(ArrayList codonList){
        ArrayList<String> aminoAcids = new ArrayList<String>();
        
        for(int i = 0; i < codonList.size(); i++){
            if(codonList.get(i).equals("UUU")){
                aminoAcids.add("Phenylalanine ");
            }
            else if(codonList.get(i).equals("UUC")){
                aminoAcids.add("Phenylalanine");
            }
            else if(codonList.get(i).equals("UUA")){
                aminoAcids.add("Leucine ");
            }
            else if(codonList.get(i).equals("UUG")){
                aminoAcids.add("Leucine ");
            }
            else if(codonList.get(i).equals("CUU")){
                aminoAcids.add("Leucine ");
            }
            else if(codonList.get(i).equals("CUC")){
                aminoAcids.add("Leucine ");
            }
            else if(codonList.get(i).equals("CUA")){
                aminoAcids.add("Leucine ");
            }
            else if(codonList.get(i).equals("CUG")){
                aminoAcids.add("Leucine ");
            }
            else if(codonList.get(i).equals("AUU")){
                aminoAcids.add("Isoleucine ");
            }
            else if(codonList.get(i).equals("AUC")){
                aminoAcids.add("Isoleucine ");
            }
            else if(codonList.get(i).equals("AUA")){
                aminoAcids.add("Isoleucine ");
            }
            else if(codonList.get(i).equals("AUG")){
                aminoAcids.add("Methionine ");
            }
            else if(codonList.get(i).equals("GUU")){
                aminoAcids.add("Valine ");
            }
            else if(codonList.get(i).equals("GUC")){
                aminoAcids.add("Valine ");
            }
            else if(codonList.get(i).equals("GUA")){
                aminoAcids.add("Valine ");
            }
            else if(codonList.get(i).equals("GUG")){
                aminoAcids.add("Valine ");
            }
            else if(codonList.get(i).equals("UCU")){
                aminoAcids.add("Serine ");
            }
            else if(codonList.get(i).equals("UCC")){
                aminoAcids.add("Serine ");
            }
            else if(codonList.get(i).equals("UCA")){
                aminoAcids.add("Serine ");
            }
            else if(codonList.get(i).equals("UCG")){
                aminoAcids.add("Serine ");
            }
            else if(codonList.get(i).equals("CCU")){
                aminoAcids.add("Proline ");
            }
            else if(codonList.get(i).equals("CCC")){
                aminoAcids.add("Proline ");
            }
            else if(codonList.get(i).equals("CCA")){
                aminoAcids.add("Proline ");
            }
            else if(codonList.get(i).equals("CCG")){
                aminoAcids.add("Proline ");
            }
            else if(codonList.get(i).equals("ACU")){
                aminoAcids.add("Threonine ");
            }
            else if(codonList.get(i).equals("ACC")){
                aminoAcids.add("Threonine ");
            }
            else if(codonList.get(i).equals("ACA")){
                aminoAcids.add("Threonine ");
            }
            else if(codonList.get(i).equals("ACG")){
                aminoAcids.add("Threonine ");
            }
            else if(codonList.get(i).equals("GCU")){
                aminoAcids.add("Alanine ");
            }
            else if(codonList.get(i).equals("GCC")){
                aminoAcids.add("Alanine ");
            }
            else if(codonList.get(i).equals("GCA")){
                aminoAcids.add("Alanine ");
            }
            else if(codonList.get(i).equals("GCG")){
                aminoAcids.add("Alanine ");
            }
            else if(codonList.get(i).equals("UAU")){
                aminoAcids.add("Tyrosine ");
            }
            else if(codonList.get(i).equals("UAC")){
                aminoAcids.add("Tyrosine ");
            }
            else if(codonList.get(i).equals("UAA")){
                aminoAcids.add("Ochre(Stop)");
                break;
            }
            else if(codonList.get(i).equals("UAG")){
                aminoAcids.add("Amber(Stop)");
                break;
            }
            else if(codonList.get(i).equals("CAU")){
                aminoAcids.add("Histidine ");
            }
            else if(codonList.get(i).equals("CAC")){
                aminoAcids.add("Histidine ");
            }
            else if(codonList.get(i).equals("CAA")){
                aminoAcids.add("Glutamine ");
            }
            else if(codonList.get(i).equals("CAG")){
                aminoAcids.add("Glutamine ");
            }
            else if(codonList.get(i).equals("AAU")){
                aminoAcids.add("Asparagine ");
            }
            else if(codonList.get(i).equals("AAC")){
                aminoAcids.add("Asparagine ");
            }
            else if(codonList.get(i).equals("AAA")){
                aminoAcids.add("Lysine ");
            }
            else if(codonList.get(i).equals("AAG")){
                aminoAcids.add("Lysine ");
            }
            else if(codonList.get(i).equals("GAU")){
                aminoAcids.add("Aspartic acid ");
            }
            else if(codonList.get(i).equals("GAC")){
                aminoAcids.add("Aspartic acid ");
            }
            else if(codonList.get(i).equals("GAA")){
                aminoAcids.add("Glutamic acid ");
            }
            else if(codonList.get(i).equals("GAG")){
                aminoAcids.add("Glutamic acid ");
            }
            else if(codonList.get(i).equals("UGU")){
                aminoAcids.add("Cysteine ");
            }
            else if(codonList.get(i).equals("UGC")){
                aminoAcids.add("Cysteine ");
            }
            else if(codonList.get(i).equals("UGA")){
                aminoAcids.add("Opal(Stop)");
                break;
            }
            else if(codonList.get(i).equals("UGG")){
                aminoAcids.add("Tryptophan ");
            }
            else if(codonList.get(i).equals("CGU")){
                aminoAcids.add("Arginine ");
            }
            else if(codonList.get(i).equals("CGC")){
                aminoAcids.add("Arginine ");
            }
            else if(codonList.get(i).equals("CGA")){
                aminoAcids.add("Arginine ");
            }
            else if(codonList.get(i).equals("CGG")){
                aminoAcids.add("Arginine ");
            }
            else if(codonList.get(i).equals("AGU")){
                aminoAcids.add("Serine ");
            }
            else if(codonList.get(i).equals("AGC")){
                aminoAcids.add("Serine ");
            }
            else if(codonList.get(i).equals("AGA")){
                aminoAcids.add("Arginine ");
            }
            else if(codonList.get(i).equals("AGG")){
                aminoAcids.add("Arginine ");
            }
            else if(codonList.get(i).equals("GGU")){
                aminoAcids.add("Glycine ");
            }
            else if(codonList.get(i).equals("GGC")){
                aminoAcids.add("Glycine ");
            }
            else if(codonList.get(i).equals("GGA")){
                aminoAcids.add("Glycine ");
            }
            else if(codonList.get(i).equals("GGG")){
                aminoAcids.add("Glycine ");
            }
            else{
                aminoAcids.add("none");
            }
            
        }   
        System.out.println("Amino Acid Sequence: \n"
                + "==================================");
        System.out.println(aminoAcids);    
            
            
                
                
            
            
                
            
            
            
            
            
            
            
        }   
            
        
    }
        
     
        
   

