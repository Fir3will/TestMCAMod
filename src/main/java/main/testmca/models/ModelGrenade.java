package main.testmca.models;

import java.util.HashMap;
import mca.MCAClientLibrary.MCAModelRenderer;
import mca.MCACommonLibrary.MCAVersionChecker;
import mca.MCACommonLibrary.math.Matrix4f;
import mca.MCACommonLibrary.math.Quaternion;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelGrenade extends ModelBase
{
	public final int MCA_MIN_REQUESTED_VERSION = 3;
	public HashMap<String, MCAModelRenderer> parts = new HashMap<String, MCAModelRenderer>();

	MCAModelRenderer a;
	MCAModelRenderer b;
	MCAModelRenderer c;
	MCAModelRenderer d;
	MCAModelRenderer e;
	MCAModelRenderer f;
	MCAModelRenderer g;
	MCAModelRenderer h;
	MCAModelRenderer i;
	MCAModelRenderer j;
	MCAModelRenderer k;
	MCAModelRenderer l;
	MCAModelRenderer m;
	MCAModelRenderer n;
	MCAModelRenderer o;
	MCAModelRenderer p;
	MCAModelRenderer q;
	MCAModelRenderer r;
	MCAModelRenderer s;
	MCAModelRenderer t;
	MCAModelRenderer u;
	MCAModelRenderer v;
	MCAModelRenderer w;
	MCAModelRenderer x;
	MCAModelRenderer y;
	MCAModelRenderer z;
	MCAModelRenderer aa;

	public ModelGrenade(int size)
	{
		float offset = size / -2;
		MCAVersionChecker.checkForLibraryVersion(getClass(), MCA_MIN_REQUESTED_VERSION);

		textureWidth = 64;
		textureHeight = 64;

		a = new MCAModelRenderer(this, "a", 0, 0);
		a.mirror = false;
		a.addBox(offset, offset, offset, size, size, size);
		a.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		a.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
		a.setTextureSize(64, 64);
		parts.put(a.boxName, a);

		b = new MCAModelRenderer(this, "b", 0, 0);
		b.mirror = false;
		b.addBox(offset, offset, offset, size, size, size);
		b.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		b.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.15468585F, 0.23819532F, 0.52221066F, 0.8041339F)).transpose());
		b.setTextureSize(64, 64);
		parts.put(b.boxName, b);

		c = new MCAModelRenderer(this, "c", 0, 0);
		c.mirror = false;
		c.addBox(offset, offset, offset, size, size, size);
		c.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		c.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.28401536F, 0.95881975F)).transpose());
		c.setTextureSize(64, 64);
		parts.put(c.boxName, c);

		d = new MCAModelRenderer(this, "d", 0, 0);
		d.mirror = false;
		d.addBox(offset, offset, offset, size, size, size);
		d.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		d.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.54463905F, 0.83867055F)).transpose());
		d.setTextureSize(64, 64);
		parts.put(d.boxName, d);

		e = new MCAModelRenderer(this, "e", 0, 0);
		e.mirror = false;
		e.addBox(offset, offset, offset, size, size, size);
		e.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		e.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.080664724F, 0.27231953F, 0.27231953F, 0.9193353F)).transpose());
		e.setTextureSize(64, 64);
		parts.put(e.boxName, e);

		f = new MCAModelRenderer(this, "f", 0, 0);
		f.mirror = false;
		f.addBox(offset, offset, offset, size, size, size);
		f.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		f.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.28401536F, 0.0F, 0.95881975F)).transpose());
		f.setTextureSize(64, 64);
		parts.put(f.boxName, f);

		g = new MCAModelRenderer(this, "g", 0, 0);
		g.mirror = false;
		g.addBox(offset, offset, offset, size, size, size);
		g.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		g.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.54463905F, 0.0F, 0.83867055F)).transpose());
		g.setTextureSize(64, 64);
		parts.put(g.boxName, g);

		h = new MCAModelRenderer(this, "h", 0, 0);
		h.mirror = false;
		h.addBox(offset, offset, offset, size, size, size);
		h.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		h.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.15468585F, 0.52221066F, 0.23819532F, 0.8041339F)).transpose());
		h.setTextureSize(64, 64);
		parts.put(h.boxName, h);

		i = new MCAModelRenderer(this, "i", 0, 0);
		i.mirror = false;
		i.addBox(offset, offset, offset, size, size, size);
		i.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		i.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.2966317F, 0.45677274F, 0.45677274F, 0.7033683F)).transpose());
		i.setTextureSize(64, 64);
		parts.put(i.boxName, i);

		j = new MCAModelRenderer(this, "j", 0, 0);
		j.mirror = false;
		j.addBox(offset, offset, offset, size, size, size);
		j.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		j.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.28401536F, 0.0F, 0.0F, 0.95881975F)).transpose());
		j.setTextureSize(64, 64);
		parts.put(j.boxName, j);

		k = new MCAModelRenderer(this, "k", 0, 0);
		k.mirror = false;
		k.addBox(offset, offset, offset, size, size, size);
		k.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		k.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.27231953F, 0.080664724F, 0.27231953F, 0.9193353F)).transpose());
		k.setTextureSize(64, 64);
		parts.put(k.boxName, k);

		l = new MCAModelRenderer(this, "l", 0, 0);
		l.mirror = false;
		l.addBox(offset, offset, offset, size, size, size);
		l.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		l.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.23819532F, 0.15468585F, 0.52221066F, 0.8041339F)).transpose());
		l.setTextureSize(64, 64);
		parts.put(l.boxName, l);

		m = new MCAModelRenderer(this, "m", 0, 0);
		m.mirror = false;
		m.addBox(offset, offset, offset, size, size, size);
		m.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		m.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.27231953F, 0.27231953F, -0.080664724F, 0.9193353F)).transpose());
		m.setTextureSize(64, 64);
		parts.put(m.boxName, m);

		n = new MCAModelRenderer(this, "n", 0, 0);
		n.mirror = false;
		n.addBox(offset, offset, offset, size, size, size);
		n.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		n.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.33844826F, 0.3384483F, 0.1837624F, 0.8585668F)).transpose());
		n.setTextureSize(64, 64);
		parts.put(n.boxName, n);

		o = new MCAModelRenderer(this, "o", 0, 0);
		o.mirror = false;
		o.addBox(offset, offset, offset, size, size, size);
		o.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		o.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.37670222F, 0.37670222F, 0.43305477F, 0.7270863F)).transpose());
		o.setTextureSize(64, 64);
		parts.put(o.boxName, o);

		p = new MCAModelRenderer(this, "p", 0, 0);
		p.mirror = false;
		p.addBox(offset, offset, offset, size, size, size);
		p.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		p.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.23819532F, 0.52221066F, -0.15468585F, 0.8041339F)).transpose());
		p.setTextureSize(64, 64);
		parts.put(p.boxName, p);

		q = new MCAModelRenderer(this, "q", 0, 0);
		q.mirror = false;
		q.addBox(offset, offset, offset, size, size, size);
		q.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		q.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.37670222F, 0.56835705F, 0.080070525F, 0.7270863F)).transpose());
		q.setTextureSize(64, 64);
		parts.put(q.boxName, q);

		r = new MCAModelRenderer(this, "r", 0, 0);
		r.mirror = false;
		r.addBox(offset, offset, offset, size, size, size);
		r.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		r.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.48418373F, 0.5676932F, 0.30823225F, 0.5901555F)).transpose());
		r.setTextureSize(64, 64);
		parts.put(r.boxName, r);

		s = new MCAModelRenderer(this, "s", 0, 0);
		s.mirror = false;
		s.addBox(offset, offset, offset, size, size, size);
		s.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		s.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.54463905F, 0.0F, 0.0F, 0.83867055F)).transpose());
		s.setTextureSize(64, 64);
		parts.put(s.boxName, s);

		t = new MCAModelRenderer(this, "t", 0, 0);
		t.mirror = false;
		t.addBox(offset, offset, offset, size, size, size);
		t.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		t.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.52221066F, 0.15468585F, 0.23819532F, 0.8041339F)).transpose());
		t.setTextureSize(64, 64);
		parts.put(t.boxName, t);

		u = new MCAModelRenderer(this, "u", 0, 0);
		u.mirror = false;
		u.addBox(offset, offset, offset, size, size, size);
		u.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		u.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.45677274F, 0.2966317F, 0.45677274F, 0.7033683F)).transpose());
		u.setTextureSize(64, 64);
		parts.put(u.boxName, u);

		v = new MCAModelRenderer(this, "v", 0, 0);
		v.mirror = false;
		v.addBox(offset, offset, offset, size, size, size);
		v.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		v.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.52221066F, 0.23819532F, -0.15468585F, 0.8041339F)).transpose());
		v.setTextureSize(64, 64);
		parts.put(v.boxName, v);

		w = new MCAModelRenderer(this, "w", 0, 0);
		w.mirror = false;
		w.addBox(offset, offset, offset, size, size, size);
		w.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		w.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.56835705F, 0.37670222F, 0.080070525F, 0.7270863F)).transpose());
		w.setTextureSize(64, 64);
		parts.put(w.boxName, w);

		x = new MCAModelRenderer(this, "x", 0, 0);
		x.mirror = false;
		x.addBox(offset, offset, offset, size, size, size);
		x.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		x.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.56769323F, 0.48418373F, 0.30823225F, 0.5901555F)).transpose());
		x.setTextureSize(64, 64);
		parts.put(x.boxName, x);

		y = new MCAModelRenderer(this, "y", 0, 0);
		y.mirror = false;
		y.addBox(offset, offset, offset, size, size, size);
		y.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		y.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.45677274F, 0.45677274F, -0.2966317F, 0.7033683F)).transpose());
		y.setTextureSize(64, 64);
		parts.put(y.boxName, y);

		z = new MCAModelRenderer(this, "z", 0, 0);
		z.mirror = false;
		z.addBox(offset, offset, offset, size, size, size);
		z.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		z.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.5676932F, 0.5676932F, -0.08464892F, 0.5901555F)).transpose());
		z.setTextureSize(64, 64);
		parts.put(z.boxName, z);

		aa = new MCAModelRenderer(this, "aa", 0, 0);
		aa.mirror = false;
		aa.addBox(offset, offset, offset, size, size, size);
		aa.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		aa.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.6318581F, 0.6318581F, 0.13430558F, 0.4283371F)).transpose());
		aa.setTextureSize(64, 64);
		parts.put(aa.boxName, aa);

	}

	@Override
	public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
	{
		//Render every non-child part
		a.render(par7);
		b.render(par7);
		c.render(par7);
		d.render(par7);
		e.render(par7);
		f.render(par7);
		g.render(par7);
		h.render(par7);
		i.render(par7);
		j.render(par7);
		k.render(par7);
		l.render(par7);
		m.render(par7);
		n.render(par7);
		o.render(par7);
		p.render(par7);
		q.render(par7);
		r.render(par7);
		s.render(par7);
		t.render(par7);
		u.render(par7);
		v.render(par7);
		w.render(par7);
		x.render(par7);
		y.render(par7);
		z.render(par7);
		aa.render(par7);
	}

	@Override
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
	{
	}

	public MCAModelRenderer getModelRendererFromName(String name)
	{
		return parts.get(name);
	}
}