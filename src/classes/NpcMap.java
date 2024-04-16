/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Noverify
 */
public class NpcMap implements IAction {

    int[] cmd;

    public NpcMap(int[] cmd) {
        this.cmd = cmd;
    }

    public void perform() {
        if (class_acv.s.aG == cmd[1]) {
            return;
        }
        class_gm.a().b(cmd[0], cmd[2], cmd[3]);
        class_go.a().b(cmd[1], cmd[2], cmd[3]);
		class_abj.cw = class_acv.s.aG;
        class_yi.g();
    }

}
