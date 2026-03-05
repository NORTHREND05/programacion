package tema3;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) throws InterruptedException {
        // Variables
        Scanner t = new Scanner(System.in);
        byte bala = (byte) (Math.random() * 6 + 1);
        int dinero = 1000;
        byte respuesta;

        // Primer tiro
        System.out.print("¿Quieres dispararte el primer tiro? 1(si)/0(no): ");
        respuesta = t.nextByte();
        if (respuesta == 1) {
            System.out.println("Apuntando...");
            Thread.sleep(1500);
            System.out.println("Disparando...");
            Thread.sleep(1500);
            if (bala == 1) {
                System.out.println("Has muerto. Pierdes todo.");
                dinero = 0;
            } else {
                dinero *= 2;
                System.out.println("Te has salvado. Ahora tienes " + dinero + "€.");
            }
            // Segundo tiro
            if (dinero != 0) {
                System.out.print("¿Quieres dispararte el segundo tiro? (s/n): ");
                respuesta = t.nextByte();
                if (respuesta == 1) {
                    System.out.println("Apuntando...");
                    Thread.sleep(1500);
                    System.out.println("Disparando...");
                    Thread.sleep(1500);
                    if (bala == 2) {
                        System.out.println("Has muerto. Pierdes todo.");
                        dinero = 0;
                    } else {
                        dinero *= 2;
                        System.out.println("Te has salvado. Ahora tienes " + dinero + "€.");
                    }
                    // Tercer tiro
                    if (dinero != 0) {
                        System.out.print("¿Quieres dispararte el tercer tiro? 1(si)/0(no): ");
                        respuesta = t.nextByte();
                        if (respuesta == 1) {
                            System.out.println("Apuntando...");
                            Thread.sleep(1500);
                            System.out.println("Disparando...");
                            Thread.sleep(1500);
                            if (bala == 3) {
                                System.out.println("Has muerto. Pierdes todo.");
                                dinero = 0;
                            } else {
                                dinero *= 2;
                                System.out.println("Te has salvado. Ahora tienes " + dinero + "€.");
                            }
                            // Cuarto tiro
                            if (dinero != 0) {
                                System.out.print("¿Quieres dispararte el cuarto tiro? 1(si)/0(no): ");
                                respuesta = t.nextByte();
                                if (respuesta == 1) {
                                    System.out.println("Apuntando...");
                                    Thread.sleep(1500);
                                    System.out.println("Disparando...");
                                    Thread.sleep(1500);
                                    if (bala == 4) {
                                        System.out.println("Has muerto. Pierdes todo.");
                                        dinero = 0;
                                    } else {
                                        dinero *= 2;
                                        System.out.println("Te has salvado. Ahora tienes " + dinero + "€.");
                                    }
                                    // Quinto tiro
                                    if (dinero != 0) {
                                        System.out.print("¿Quieres dispararte el quinto tiro? 1(si)/0(no): ");
                                        respuesta = t.nextByte();
                                        if (respuesta == 1) {
                                            System.out.println("Apuntando...");
                                            Thread.sleep(1500);
                                            System.out.println("Disparando...");
                                            Thread.sleep(1500);
                                            if (bala == 5) {
                                                System.out.println("Has muerto. Pierdes todo.");
                                                dinero = 0;
                                            } else {
                                                dinero *= 2;
                                                System.out.println("Te has salvado. Ahora tienes " + dinero + "€.");
                                            }
                                            // Sexto tiro
                                            if (dinero != 0) {
                                                System.out.print("¿Quieres dispararte el sexto tiro? 1(si)/0(no): ");
                                                respuesta = t.nextByte();
                                                if (respuesta == 1) {
                                                    System.out.println("Apuntando...");
                                                    Thread.sleep(1500);
                                                    System.out.println("Disparando...");
                                                    Thread.sleep(1500);

                                                    if (bala == 6) {
                                                        System.out.println("Has muerto. Pierdes todo.");
                                                        dinero = 0;
                                                    } else {
                                                        dinero *= 2;
                                                        System.out.println("Te has salvado. Ahora tienes " + dinero + "€.");
                                                    }
                                                } else {
                                                    System.out.println("Te retiras con " + dinero + "€.");
                                                }
                                            }
                                        } else {
                                            System.out.println("Te retiras con " + dinero + "€.");
                                        }
                                    }
                                } else {
                                    System.out.println("Te retiras con " + dinero + "€.");
                                }
                            }
                        } else {
                            System.out.println("Te retiras con " + dinero + "€.");
                        }
                    }
                } else {
                    System.out.println("Te retiras con " + dinero + "€.");
                }
            }
        } else {
            System.out.println("Te retiras con " + dinero + "€.");
        }
        System.out.println("Fin del juego.");
    }
}
