package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerJunit {
	@Test
	public void givenMood_IsHappy_ShouldReturnSad() {
		MoodAnalyzer analzser = new MoodAnalyzer("I am in Sad mood");
		Assert.assertEquals("SAD",analzser.analyzeMood());
	}
	@Test
	public void givenMood_IsAny_ShouldReturnHappy() {
		MoodAnalyzer analzser = new MoodAnalyzer("I am in Happy mood");
		Assert.assertEquals("HAPPY",analzser.analyzeMood());
	}
	
/*	//------------for tc 1.1 u need to do changes in method-----------//
	@Test
	public void givenMood_IsSad_ShouldReturnException() {
		MoodAnalyzer analzser = new MoodAnalyzer();
		Assert.assertEquals("Sad",analzser.analyzeMood());
	}   */
	
	
	@Test
	public void givenMood_IsHappy_ShouldReturnException() {
		MoodAnalyzer analzser = new MoodAnalyzer();
		Assert.assertEquals("HAPPY",analzser.analyzeMood());
	}
	
	@Test
	public void givenMood_IsNull_ShouldReturnException() {
		MoodAnalyzer analzser = new MoodAnalyzer(null);
		Assert.assertEquals("HAPPY",analzser.analyzeMood());
	}
}
