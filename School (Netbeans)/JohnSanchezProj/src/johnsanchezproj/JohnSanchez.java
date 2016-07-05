/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnsanchezproj;

/**
 *
 * @author 19kamatha
 */
public class JohnSanchez {
    private Girlfriend jG;
    private int sAbil, intel;
    private boolean foundJesus;
    public JohnSanchez(Girlfriend g, int singAbil, int intelligence)
    {
        jG = g;
        sAbil = singAbil;
        intel = intelligence;
    }
    public void setFoundJesus(boolean b)
    {
        foundJesus = b;
    }
    public boolean getFoundJesus()
    {
        return foundJesus;
    }
}
