package org.example;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        int dimension;
        int primes=0;

        dimension = readDim();
        int [] vector;
        vector = new int [dimension];
        fillVector(vector);
        System.out.println("Arreglo de números");
        showVector(vector);

        for (int pos=0; pos< vector.length; pos++) {
            if (isPrime(vector [pos])) primes++;
        }

        int [] vectorPrimes = new int [primes];
        copyVectors(vector, vectorPrimes);
        System.out.println("Números primos");
        showVector(vectorPrimes);
    }
    public static int readDim() {
        System.out.println("Ingrese la dimension del vector: ");
        Scanner sc = new Scanner(System.in);
        int dim = sc.nextInt();
        return dim;
    }

    public static void fillVector(int vec[]) {
        for (int x=0;x< vec.length;x++){
            vec[x]=(int)(Math.random()*100);
        }
    }

    public static void showVector(int [] vec) {
        for (int x=0;x< vec.length;x++) {
            System.out.println(vec[x]);
        }
    }

    public static boolean isPrime(int number) {
        boolean prime = true;
        if (number == 0){
            prime = false;
        }
        if (number == 1){
            prime = false;
        }
        for (int cont=2;cont<number;cont++){
            if (number%cont == 0){
                prime=false;
            }
        }
        return prime;
    }
    public static void copyVectors(int [] vec, int [] otherVec) {
        int otherPos=0;
        for(int pos=0;pos<vec.length;pos++){
            if (isPrime(vec[pos])){
                otherVec[otherPos]=vec[pos];
                otherPos++;
            }
        }

    }
}