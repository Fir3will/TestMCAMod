package main.testmca.animations.Grenade;

import java.util.HashMap;
import mca.MCACommonLibrary.IMCAnimatedEntity;
import mca.MCACommonLibrary.animation.AnimationHandler;
import mca.MCACommonLibrary.animation.Channel;

public class AnimationHandlerGrenade extends AnimationHandler
{
	/** Map with all the animations. */
	public static HashMap<String, Channel> animChannels = new HashMap<String, Channel>();
	static
	{}

	public AnimationHandlerGrenade(IMCAnimatedEntity entity)
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