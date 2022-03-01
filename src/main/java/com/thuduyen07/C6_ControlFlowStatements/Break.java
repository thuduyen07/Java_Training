package com.thuduyen07.C6_ControlFlowStatements;

public class Break {
    public static void main(String[] args) {
        for(int i=0; i<2; i++){
            for(int j=i; j<6; j++){
                System.out.println(j);
                if(j==3){
                    break;
                }
            }
        }
    }
}
