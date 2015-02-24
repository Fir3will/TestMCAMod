package main.testmca.animations.HornedGoat;

import java.util.HashMap;
import mca.MCACommonLibrary.IMCAnimatedEntity;
import mca.MCACommonLibrary.animation.AnimationHandler;
import mca.MCACommonLibrary.animation.Channel;

public class AnimationHandlerHornedGoat extends AnimationHandler
{
	/** Map with all the animations. */
	public static HashMap<String, Channel> animChannels = new HashMap<String, Channel>();
	static
	{
		animChannels.put("eatingStill", new ChannelEatingStill("eatingStill", 90.0F, 60, Channel.LOOP));
		animChannels.put("charge", new ChannelCharge("charge", 90.0F, 80, Channel.LINEAR));
	}

	public AnimationHandlerHornedGoat(IMCAnimatedEntity entity)
	{
		super(entity);
	}

	@Override
	public void activateAnimation(String name, float startingFrame)
	{
		super.activateAnimation(animChannels, name, startingFrame);
	}

	@Override
	public void stopAnimation(String name)
	{
		super.stopAnimation(animChannels, name);
	}

	@Override
	public void fireAnimationEventClientSide(Channel anim, float prevFrame, float frame)
	{
	}

	@Override
	public void fireAnimationEventServerSide(Channel anim, float prevFrame, float frame)
	{
	}
}