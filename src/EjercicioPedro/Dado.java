package EjercicioPedro;

import java.util.Random;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class Dado {
    private int dados[] = {0, 0, 0, 0, 0, 0};
    private AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(dados);


    protected int lanzarDado() {
        Random random = new Random();

        return random.nextInt(6) + 1;


    }

    protected void aumentarContador(int num) {
        atomicIntegerArray.incrementAndGet(num - 1);
    }

    public void showCounters() {
        double total = atomicIntegerArray.get(0) + atomicIntegerArray.get(1) + atomicIntegerArray.get(2)
                + atomicIntegerArray.get(3) + atomicIntegerArray.get(4) + atomicIntegerArray.get(5);
        System.out.printf("Número 1: %d veces\n" +
                        "Número 2: %d veces\n" +
                        "Número 3: %d veces\n" +
                        "Número 4: %d veces\n" +
                        "Número 5: %d veces\n" +
                        "Número 6: %d veces\n" +
                        "Total de veces: %d + %d + %d + %d + %d + %d = %.0f", atomicIntegerArray.get(0), atomicIntegerArray.get(1), atomicIntegerArray.get(2)
                , atomicIntegerArray.get(3), atomicIntegerArray.get(4), atomicIntegerArray.get(5), atomicIntegerArray.get(0), atomicIntegerArray.get(1), atomicIntegerArray.get(2)
                , atomicIntegerArray.get(3), atomicIntegerArray.get(4), atomicIntegerArray.get(5), total);
    }
}
