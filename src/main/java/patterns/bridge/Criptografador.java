package patterns.bridge;

public class Criptografador implements PosProcessador {

    private int delay;

    public Criptografador(int delay) {
        this.delay = delay;
    }

    @Override
    public byte[] processar(byte[] bytes) {
        byte[] newBytes = new byte[bytes.length];
        for (int i=0; i < bytes.length; i++) {
            newBytes[i] = (byte) ((bytes[i] + delay) % Byte.MAX_VALUE);
        }
        return newBytes;
    }
}
