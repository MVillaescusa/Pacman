package control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author mario
 */
public final class Teclado implements KeyListener {

    private final int numTeclas = 120; //Cantidad de teclas aproximadas del teclado
    private final boolean[] teclas = new boolean[numTeclas];

    public boolean arriba;
    public boolean abajo;
    public boolean izquierda;
    public boolean derecha;
    public boolean salir;
    public boolean pausa = false;

    public void actualizar() {
        arriba = teclas[KeyEvent.VK_UP];
        abajo = teclas[KeyEvent.VK_DOWN];
        izquierda = teclas[KeyEvent.VK_LEFT];
        derecha = teclas[KeyEvent.VK_RIGHT];
        salir = teclas[KeyEvent.VK_ESCAPE];
        pausa = teclas[KeyEvent.VK_P];
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        if (ke.getKeyChar() == 'p' || ke.getKeyChar() == 'P') {
            pausa = !pausa;
        }
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyChar() != 'p' && ke.getKeyChar() != 'P') {
            teclas[ke.getKeyCode()] = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        if (ke.getKeyChar() != 'p' && ke.getKeyChar() != 'P') {
            teclas[ke.getKeyCode()] = false;
        }
    }
}
