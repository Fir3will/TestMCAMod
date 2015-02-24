package main.testmca.animations.HornedGoat;

import mca.MCACommonLibrary.animation.*;
import mca.MCACommonLibrary.math.*;

public class ChannelEatingStill extends Channel
{
	public ChannelEatingStill(String _name, float _fps, int _totalFrames, byte _mode)
	{
		super(_name, _fps, _totalFrames, _mode);
	}

	@Override
	protected void initializeAllFrames()
	{
		KeyFrame frame0 = new KeyFrame();
		frame0.modelRenderersRotations.put("jaw", new Quaternion(0.008726535F, 0.0F, 0.0F, 0.9999619F));
		frame0.modelRenderersTranslations.put("jaw", new Vector3f(1.5F, 0.3F, 0.5F));
		keyFrames.put(0, frame0);

		KeyFrame frame50 = new KeyFrame();
		frame50.modelRenderersRotations.put("jaw", new Quaternion(0.0F, 0.0F, 0.0F, 1.0F));
		frame50.modelRenderersTranslations.put("jaw", new Vector3f(1.5F, 0.3F, 0.5F));
		keyFrames.put(50, frame50);

		KeyFrame frame20 = new KeyFrame();
		frame20.modelRenderersRotations.put("jaw", new Quaternion(0.02617695F, 0.0F, 0.0F, 0.99965733F));
		frame20.modelRenderersTranslations.put("jaw", new Vector3f(1.5F, 0.3F, 0.5F));
		keyFrames.put(20, frame20);

		KeyFrame frame59 = new KeyFrame();
		frame59.modelRenderersRotations.put("jaw", new Quaternion(0.0F, 0.0F, 0.0F, 1.0F));
		frame59.modelRenderersTranslations.put("jaw", new Vector3f(1.5F, 0.3F, 0.5F));
		keyFrames.put(59, frame59);

		KeyFrame frame40 = new KeyFrame();
		frame40.modelRenderersRotations.put("jaw", new Quaternion(0.017452406F, 0.0F, 0.0F, 0.9998477F));
		frame40.modelRenderersTranslations.put("jaw", new Vector3f(1.5F, 0.3F, 0.5F));
		keyFrames.put(40, frame40);

		KeyFrame frame10 = new KeyFrame();
		frame10.modelRenderersRotations.put("jaw", new Quaternion(0.017527217F, 0.0088771675F, 0.00857258F, 0.9997702F));
		frame10.modelRenderersTranslations.put("jaw", new Vector3f(1.5F, 0.3F, 0.5F));
		keyFrames.put(10, frame10);

		KeyFrame frame30 = new KeyFrame();
		frame30.modelRenderersRotations.put("jaw", new Quaternion(0.034972943F, -0.009025427F, -0.008416347F, 0.999312F));
		frame30.modelRenderersTranslations.put("jaw", new Vector3f(1.5F, 0.3F, 0.5F));
		keyFrames.put(30, frame30);

	}
}