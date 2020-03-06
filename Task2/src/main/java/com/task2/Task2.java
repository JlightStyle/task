package com.task2;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;

public class Task2 {
    public static void main(String[] args){
        int[] price = {5,100,20,66,16,200,555,964};
        try {
            int[] response = decryptData(price,50,3,6);
            for(int i: response){
                System.out.println(i);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Выход за пределы массива");
        }
    }

    static int[] decryptData(@NonNull int[] price,              //использовал static, чтобы не плодить классы
                      @IntRange(from = 1) int discount,
                      @IntRange(from = 0) int offset,
                      @IntRange(from = 1) int readLength) {
        if(price.length<offset+readLength){
            throw new ArrayIndexOutOfBoundsException("Выход за пределы");
        }
        int[] response = new int[readLength];
        int responseCounter=0;
        for(int i=offset;i<offset+readLength;i++){
            response[responseCounter] = (int)Math.floor(price[i]*(1-(double)discount/100));
            responseCounter++;
        }

        return response;
    }
}
