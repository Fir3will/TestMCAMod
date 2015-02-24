package main.testmca.animations.HornedGoat;

import mca.MCACommonLibrary.animation.*;
import mca.MCACommonLibrary.math.*;

public class ChannelCharge extends Channel
{
	public ChannelCharge(String _name, float _fps, int _totalFrames, byte _mode)
	{
		super(_name, _fps, _totalFrames, _mode);
	}

	@Override
	protected void initializeAllFrames()
	{
		KeyFrame frame0 = new KeyFrame();
		frame0.modelRenderersRotations.put("upperLeg1", new Quaternion(0.06975647F, 0.0F, 0.0F, 0.9975641F));
		frame0.modelRenderersRotations.put("neck1", new Quaternion(0.57357645F, 0.0F, 0.0F, 0.81915206F));
		frame0.modelRenderersRotations.put("bodyMain", new Quaternion(0.0F, 0.0F, 0.0F, 1.0F));
		frame0.modelRenderersRotations.put("head", new Quaternion(-0.4617486F, 0.0F, 0.0F, 0.8870108F));
		frame0.modelRenderersRotations.put("upperLeg2", new Quaternion(0.06975647F, 0.0F, 0.0F, 0.9975641F));
		frame0.modelRenderersTranslations.put("upperLeg1", new Vector3f(-1.6F, 0.0F, 0.5F));
		frame0.modelRenderersTranslations.put("tail", new Vector3f(0.0F, 5.5F, 0.0F));
		frame0.modelRenderersTranslations.put("neck1", new Vector3f(0.0F, 5.0F, 10.0F));
		frame0.modelRenderersTranslations.put("neck2", new Vector3f(0.0F, 5.0F, 10.0F));
		frame0.modelRenderersTranslations.put("flLeg", new Vector3f(1.5F, 0.0F, 11.0F));
		frame0.modelRenderersTranslations.put("bodyMain", new Vector3f(0.0F, -16.0F, -4.0F));
		frame0.modelRenderersTranslations.put("frLeg", new Vector3f(-1.5F, 0.0F, 11.0F));
		frame0.modelRenderersTranslations.put("head", new Vector3f(-1.5F, 4.0F, 0.0F));
		frame0.modelRenderersTranslations.put("brLeg", new Vector3f(0.0F, 0.0F, 0.0F));
		frame0.modelRenderersTranslations.put("upperLeg2", new Vector3f(1.6F, 0.0F, 0.5F));
		keyFrames.put(0, frame0);

		KeyFrame frame35 = new KeyFrame();
		frame35.modelRenderersTranslations.put("frLeg", new Vector3f(-1.5F, 0.0F, 11.0F));
		keyFrames.put(35, frame35);

		KeyFrame frame38 = new KeyFrame();
		frame38.modelRenderersRotations.put("neck1", new Quaternion(0.42261827F, 0.0F, 0.0F, 0.90630776F));
		frame38.modelRenderersRotations.put("head", new Quaternion(-0.17364818F, 0.0F, 0.0F, 0.9848077F));
		frame38.modelRenderersTranslations.put("neck1", new Vector3f(0.0F, 5.0F, 8.0F));
		frame38.modelRenderersTranslations.put("neck2", new Vector3f(0.0F, 5.0F, 10.0F));
		frame38.modelRenderersTranslations.put("flLeg", new Vector3f(1.5F, 0.0F, 11.0F));
		frame38.modelRenderersTranslations.put("frLeg", new Vector3f(-1.5F, 0.0F, 11.0F));
		frame38.modelRenderersTranslations.put("head", new Vector3f(-1.5F, 4.0F, 0.0F));
		keyFrames.put(38, frame38);

		KeyFrame frame36 = new KeyFrame();
		frame36.modelRenderersRotations.put("upperLeg1", new Quaternion(0.19936793F, 0.0F, 0.0F, 0.9799247F));
		frame36.modelRenderersRotations.put("flLeg", new Quaternion(0.08715574F, 0.0F, 0.0F, 0.9961947F));
		frame36.modelRenderersRotations.put("bodyMain", new Quaternion(-0.21643962F, 0.0F, 0.0F, 0.976296F));
		frame36.modelRenderersRotations.put("frLeg", new Quaternion(0.08715574F, 0.0F, 0.0F, 0.9961947F));
		frame36.modelRenderersRotations.put("upperLeg2", new Quaternion(0.19936793F, 0.0F, 0.0F, 0.9799247F));
		frame36.modelRenderersTranslations.put("upperLeg1", new Vector3f(-1.6F, 0.0F, 0.5F));
		frame36.modelRenderersTranslations.put("flLeg", new Vector3f(1.5F, 0.5F, 11.0F));
		frame36.modelRenderersTranslations.put("bodyMain", new Vector3f(0.0F, -16.0F, -4.0F));
		frame36.modelRenderersTranslations.put("frLeg", new Vector3f(-1.5F, 0.5F, 11.0F));
		frame36.modelRenderersTranslations.put("upperLeg2", new Vector3f(1.6F, 0.0F, 0.5F));
		keyFrames.put(36, frame36);

		KeyFrame frame37 = new KeyFrame();
		frame37.modelRenderersTranslations.put("neck1", new Vector3f(0.0F, 5.0F, 10.0F));
		frame37.modelRenderersTranslations.put("flLeg", new Vector3f(1.5F, 0.0F, 11.0F));
		frame37.modelRenderersTranslations.put("frLeg", new Vector3f(-1.5F, 0.0F, 11.0F));
		keyFrames.put(37, frame37);

		KeyFrame frame40 = new KeyFrame();
		frame40.modelRenderersRotations.put("upperLeg1", new Quaternion(0.06975647F, 0.0F, 0.0F, 0.9975641F));
		frame40.modelRenderersRotations.put("flLeg", new Quaternion(0.0F, 0.0F, 0.0F, 1.0F));
		frame40.modelRenderersRotations.put("bodyMain", new Quaternion(0.0F, 0.0F, 0.0F, 1.0F));
		frame40.modelRenderersRotations.put("frLeg", new Quaternion(0.0F, 0.0F, 0.0F, 1.0F));
		frame40.modelRenderersRotations.put("upperLeg2", new Quaternion(0.06975647F, 0.0F, 0.0F, 0.9975641F));
		frame40.modelRenderersTranslations.put("upperLeg1", new Vector3f(-1.6F, 0.0F, 0.5F));
		frame40.modelRenderersTranslations.put("flLeg", new Vector3f(1.5F, 0.0F, 11.0F));
		frame40.modelRenderersTranslations.put("bodyMain", new Vector3f(0.0F, -16.0F, -4.0F));
		frame40.modelRenderersTranslations.put("frLeg", new Vector3f(-1.5F, 0.0F, 11.0F));
		frame40.modelRenderersTranslations.put("upperLeg2", new Vector3f(1.6F, 0.0F, 0.5F));
		keyFrames.put(40, frame40);

		KeyFrame frame79 = new KeyFrame();
		frame79.modelRenderersRotations.put("upperLeg1", new Quaternion(0.06975647F, 0.0F, 0.0F, 0.9975641F));
		frame79.modelRenderersRotations.put("neck1", new Quaternion(0.57357645F, 0.0F, 0.0F, 0.81915206F));
		frame79.modelRenderersRotations.put("flLeg", new Quaternion(0.0F, 0.0F, 0.0F, 1.0F));
		frame79.modelRenderersRotations.put("bodyMain", new Quaternion(0.0F, 0.0F, 0.0F, 1.0F));
		frame79.modelRenderersRotations.put("frLeg", new Quaternion(0.0F, 0.0F, 0.0F, 1.0F));
		frame79.modelRenderersRotations.put("head", new Quaternion(-0.4617486F, 0.0F, 0.0F, 0.8870108F));
		frame79.modelRenderersRotations.put("upperLeg2", new Quaternion(0.06975647F, 0.0F, 0.0F, 0.9975641F));
		frame79.modelRenderersTranslations.put("right horn2", new Vector3f(0.0F, 1.0F, 0.0F));
		frame79.modelRenderersTranslations.put("leftEar", new Vector3f(2.5F, 0.5F, 1.0F));
		frame79.modelRenderersTranslations.put("upperLeg1", new Vector3f(-1.6F, 0.0F, 0.5F));
		frame79.modelRenderersTranslations.put("neck1", new Vector3f(0.0F, 5.0F, 10.0F));
		frame79.modelRenderersTranslations.put("flLeg", new Vector3f(1.5F, 0.0F, 11.0F));
		frame79.modelRenderersTranslations.put("goaty", new Vector3f(0.0F, -2.0F, -1.0F));
		frame79.modelRenderersTranslations.put("bodyMain", new Vector3f(0.0F, -16.0F, -4.0F));
		frame79.modelRenderersTranslations.put("frLeg", new Vector3f(-1.5F, 0.0F, 11.0F));
		frame79.modelRenderersTranslations.put("head", new Vector3f(-1.5F, 4.0F, 0.0F));
		frame79.modelRenderersTranslations.put("upperLeg2", new Vector3f(1.6F, 0.0F, 0.5F));
		keyFrames.put(79, frame79);

		KeyFrame frame44 = new KeyFrame();
		frame44.modelRenderersRotations.put("neck1", new Quaternion(0.42261827F, 0.0F, 0.0F, 0.90630776F));
		frame44.modelRenderersRotations.put("head", new Quaternion(-0.17364818F, 0.0F, 0.0F, 0.9848077F));
		frame44.modelRenderersTranslations.put("neck1", new Vector3f(0.0F, 5.0F, 8.0F));
		frame44.modelRenderersTranslations.put("neck2", new Vector3f(0.0F, 5.0F, 10.0F));
		frame44.modelRenderersTranslations.put("head", new Vector3f(-1.5F, 4.0F, 0.0F));
		keyFrames.put(44, frame44);

		KeyFrame frame15 = new KeyFrame();
		frame15.modelRenderersRotations.put("neck1", new Quaternion(0.5F, 0.0F, 0.0F, 0.8660254F));
		frame15.modelRenderersRotations.put("head", new Quaternion(-0.3007058F, 0.0F, 0.0F, 0.95371693F));
		frame15.modelRenderersTranslations.put("neck1", new Vector3f(0.0F, 5.0F, 10.0F));
		frame15.modelRenderersTranslations.put("neck2", new Vector3f(0.0F, 5.0F, 10.0F));
		frame15.modelRenderersTranslations.put("head", new Vector3f(-1.5F, 4.0F, 0.0F));
		keyFrames.put(15, frame15);

		KeyFrame frame49 = new KeyFrame();
		frame49.modelRenderersRotations.put("head", new Quaternion(-0.17364818F, 0.0F, 0.0F, 0.9848077F));
		frame49.modelRenderersTranslations.put("neck1", new Vector3f(0.0F, 5.0F, 10.0F));
		frame49.modelRenderersTranslations.put("head", new Vector3f(-1.5F, 4.0F, 0.0F));
		keyFrames.put(49, frame49);

		KeyFrame frame55 = new KeyFrame();
		frame55.modelRenderersRotations.put("neck1", new Quaternion(0.57357645F, 0.0F, 0.0F, 0.81915206F));
		frame55.modelRenderersRotations.put("head", new Quaternion(-0.17364818F, 0.0F, 0.0F, 0.9848077F));
		frame55.modelRenderersTranslations.put("neck1", new Vector3f(0.0F, 5.0F, 10.0F));
		frame55.modelRenderersTranslations.put("head", new Vector3f(-1.5F, 4.0F, 0.0F));
		keyFrames.put(55, frame55);

		KeyFrame frame20 = new KeyFrame();
		frame20.modelRenderersRotations.put("bodyMain", new Quaternion(-0.21643962F, 0.0F, 0.0F, 0.976296F));
		frame20.modelRenderersTranslations.put("bodyMain", new Vector3f(0.0F, -16.0F, -4.0F));
		keyFrames.put(20, frame20);

		KeyFrame frame59 = new KeyFrame();
		frame59.modelRenderersRotations.put("upperLeg1", new Quaternion(0.06975647F, 0.0F, 0.0F, 0.9975641F));
		frame59.modelRenderersRotations.put("flLeg", new Quaternion(0.0F, 0.0F, 0.0F, 1.0F));
		frame59.modelRenderersRotations.put("bodyMain", new Quaternion(0.0F, 0.0F, 0.0F, 1.0F));
		frame59.modelRenderersRotations.put("frLeg", new Quaternion(0.0F, 0.0F, 0.0F, 1.0F));
		frame59.modelRenderersRotations.put("upperLeg2", new Quaternion(0.06975647F, 0.0F, 0.0F, 0.9975641F));
		frame59.modelRenderersTranslations.put("upperLeg1", new Vector3f(-1.6F, 0.0F, 0.5F));
		frame59.modelRenderersTranslations.put("flLeg", new Vector3f(1.5F, 0.0F, 11.0F));
		frame59.modelRenderersTranslations.put("bodyMain", new Vector3f(0.0F, -16.0F, -4.0F));
		frame59.modelRenderersTranslations.put("frLeg", new Vector3f(-1.5F, 0.0F, 11.0F));
		frame59.modelRenderersTranslations.put("upperLeg2", new Vector3f(1.6F, 0.0F, 0.5F));
		keyFrames.put(59, frame59);

		KeyFrame frame62 = new KeyFrame();
		frame62.modelRenderersRotations.put("head", new Quaternion(-0.4617486F, 0.0F, 0.0F, 0.8870108F));
		frame62.modelRenderersTranslations.put("head", new Vector3f(-1.5F, 4.0F, 0.0F));
		keyFrames.put(62, frame62);

		KeyFrame frame30 = new KeyFrame();
		frame30.modelRenderersRotations.put("upperLeg1", new Quaternion(0.19936793F, 0.0F, 0.0F, 0.9799247F));
		frame30.modelRenderersRotations.put("neck1", new Quaternion(0.42261827F, 0.0F, 0.0F, 0.90630776F));
		frame30.modelRenderersRotations.put("flLeg", new Quaternion(0.08715574F, 0.0F, 0.0F, 0.9961947F));
		frame30.modelRenderersRotations.put("bodyMain", new Quaternion(-0.21643962F, 0.0F, 0.0F, 0.976296F));
		frame30.modelRenderersRotations.put("frLeg", new Quaternion(0.08715574F, 0.0F, 0.0F, 0.9961947F));
		frame30.modelRenderersRotations.put("head", new Quaternion(-0.17364818F, 0.0F, 0.0F, 0.9848077F));
		frame30.modelRenderersRotations.put("upperLeg2", new Quaternion(0.19936793F, 0.0F, 0.0F, 0.9799247F));
		frame30.modelRenderersTranslations.put("upperLeg1", new Vector3f(-1.6F, 0.0F, 0.5F));
		frame30.modelRenderersTranslations.put("neck1", new Vector3f(0.0F, 5.0F, 10.0F));
		frame30.modelRenderersTranslations.put("neck2", new Vector3f(0.0F, 5.0F, 10.0F));
		frame30.modelRenderersTranslations.put("flLeg", new Vector3f(1.5F, 0.5F, 11.0F));
		frame30.modelRenderersTranslations.put("bodyMain", new Vector3f(0.0F, -16.0F, -4.0F));
		frame30.modelRenderersTranslations.put("frLeg", new Vector3f(-1.5F, 0.5F, 11.0F));
		frame30.modelRenderersTranslations.put("head", new Vector3f(-1.5F, 4.0F, 0.0F));
		frame30.modelRenderersTranslations.put("brLeg", new Vector3f(0.0F, 0.0F, 0.0F));
		frame30.modelRenderersTranslations.put("upperLeg2", new Vector3f(1.6F, 0.0F, 0.5F));
		keyFrames.put(30, frame30);

	}
}