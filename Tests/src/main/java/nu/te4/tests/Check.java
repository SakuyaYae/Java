/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.tests;

/**
 *
 * @author SakuyaYae
 */
public class Check {
    
    public boolean IsPalindrome(String input){
        if(input == null){
            throw new IllegalArgumentException("input cant be null");
        }
        if(input.equals(reversed(input))){
            return true;
        }
        else{
            return false;
        }
    }
    
    private String reversed(String input){
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i-- ){
            reverse += input.charAt(i);
        } 
    return reverse;
    }
    
    public boolean isPrimeNumber(int number){
        if(number < 0){
            throw new IllegalArgumentException("input cant be lower than zero");
        }
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
