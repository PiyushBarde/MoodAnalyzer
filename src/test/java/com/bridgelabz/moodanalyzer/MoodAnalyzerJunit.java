package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerJunit {
	@Test
	public void givenMood_IsHappy_ShouldReturnSad() throws MoodAnalysisException {
		MoodAnalyzer analyzeMood = new MoodAnalyzer("I am in Sad mood");
		Assert.assertEquals("SAD",analyser.analyzeMood());
	}
	@Test
	public void givenMood_IsAny_ShouldReturnHappy() throws MoodAnalysisException {
		MoodAnalyzer analyser = new MoodAnalyzer("I am in Happy mood");
		Assert.assertEquals("HAPPY",analyser.analyzeMood());
	}
	@Test
	public void givenMood_IsNull_ShouldReturnHappy() throws MoodAnalysisException {
		MoodAnalyzer analyser = new MoodAnalyzer(null);
		try {
			analyser.analyzeMood();
		} catch (MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
	@Test
	public void givenMessage_WhenEmpty_ShouldThrowMoodAnalysisEmptyException() {

		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
		try {
			moodAnalyzer.analyzeMood();
		} catch (MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
}
