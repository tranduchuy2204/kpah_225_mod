package game;

import java.io.IOException;
import java.io.InputStream;

import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.io.Connector;
import javax.microedition.io.ContentConnection;
import javax.microedition.io.HttpConnection;
import javax.microedition.io.InputConnection;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;

import classes.AccountManager;
import classes.IAction;
import classes.ModController;
import classes.class_aco;
import classes.class_acv;
import classes.class_bi;
import classes.class_go;
import classes.class_ls;
import classes.class_yi;
import classes.class_yv;

public class GameMidlet extends MIDlet {

	private static class_acv i;
	public static GameMidlet a;
	public static String b;
	public static String c;
	public static String d;
	public static String e;
	public static String f;
	public static boolean g;
	public static int h;

	static {
		GameMidlet.b = ModController.VERSION;
		GameMidlet.c = "0";
		GameMidlet.d = "-1";
		GameMidlet.e = "-1";
		GameMidlet.f = "";
		GameMidlet.g = false;
		GameMidlet.h = 72;
	}

	public GameMidlet() {
		GameMidlet.a = this;
		GameMidlet.i = new class_acv();
		Display.getDisplay((MIDlet) this).setCurrent((Displayable) GameMidlet.i);
		GameMidlet.i.d();
		class_yi.S.f = true;
	}



	public final void a() {
		GameMidlet.i.c();
		GameMidlet.i.sizeChanged(0, 0);
		class_yi.b();
		class_aco.a().a(class_bi.a());
		class_go.a().a = class_aco.a();
		class_yi.f();
		class_ls.a(0, null);
		class_yv.a().d();
		class_acv.z = false;
		final InputStream resourceAsStream;
		if ((resourceAsStream = this.getClass().getResourceAsStream("/agent.txt")) != null) {
			final StringBuffer sb = new StringBuffer();
			try {
				int read;
				while ((read = resourceAsStream.read()) != -1) {
					sb.append((char) read);
				}
				GameMidlet.e = sb.toString().trim();
			} catch (IOException ex) {

			}
		}
		final InputStream resourceAsStream2;
		if ((resourceAsStream2 = this.getClass().getResourceAsStream("/provider.txt")) != null) {
			final StringBuffer sb2 = new StringBuffer();
			try {
				int read2;
				while ((read2 = resourceAsStream2.read()) != -1) {
					sb2.append((char) read2);
				}
				GameMidlet.d = sb2.toString().trim();
			} catch (IOException ex2) {
			}
		}
		System.out.println("agent: ================" + GameMidlet.e);
		System.out.println("provider: =============" + GameMidlet.d);
		System.out.println("client pro : =======" + GameMidlet.c);
		System.out.println("ban thuong " + GameMidlet.b);
	}

	public static String a(final String s) {
		try {
			final HttpConnection httpConnection;
			(httpConnection = (HttpConnection) Connector.open(s)).setRequestMethod("GET");
			httpConnection.setRequestProperty("Content-Type", "//text plain");
			httpConnection.setRequestProperty("Connection", "close");
			if (httpConnection.getResponseCode() == 200) {
				String s2 = "";
				final InputStream openInputStream = ((InputConnection) httpConnection).openInputStream();
				final int n;
				if ((n = (int) ((ContentConnection) httpConnection).getLength()) != -1) {
					final byte[] array = new byte[n];
					openInputStream.read(array);
					s2 = new String(array, "UTF-8");
				}
				return s2;
			}
		} catch (IOException ex) {
			return null;
		}
		return null;
	}

	protected void destroyApp(final boolean b) {
	}

	protected void pauseApp() {
	}

	protected void startApp() {
		AccountManager.getInstance().loadByRecord();
	}

	public static void b(final String s) {
		try {
			GameMidlet.a.platformRequest(s);
			GameMidlet.a.notifyDestroyed();
		} catch (ConnectionNotFoundException ex) {
		}
	}

	public static void a(final String s, String s2, final IAction class_gj, final IAction class_gj2) {
		new Thread(new a(s2, s, class_gj, class_gj2)).start();
	}
}
