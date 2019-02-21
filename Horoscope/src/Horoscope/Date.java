package Horoscope;

public class Date {

	public static String getFortune(int dob) {
		// TODO Auto-generated method stub
		String theTruth;
		if (120 >= dob && dob <= 218) {
			theTruth = "Aquarius - Your code is awful, but it works. The sun shines on you this day.";
		} else if (219 <= dob && dob <= 320) {
			theTruth = "Pisces - A fish never bites a hook without bait, and a println statement is nothing without an argument.";
		} else if (321 <= dob && dob <= 419) {
			theTruth = "Aries - Your associate's idea has better flow control, do not submit your work yet.";
		} else if (420 <= dob && dob <= 520) {
			theTruth = "Taurus - Avoid while statements after lunch, otherwise your errors will infinitely output.";
		} else if (521 <= dob && dob <= 620) {
			theTruth = "Gemini - Your blessings today will all be in the type of doubles.";
		} else if (621 <= dob && dob <= 722) {
			theTruth = "Cancer - A cup of coffee an hour keeps the compilation errors away.";
		} else if (723 <= dob && dob <= 822) {
			theTruth = "Leo - One does not simply test their program only once...";
		} else if (823 <= dob && dob <= 922) {
			theTruth = "Virgo - Your variables may change in value, but your heart != truth";
		} else if (923 <= dob && dob <= 1022) {
			theTruth = "Libra - That program you've been wanting to make for over a year is awful, please don't create it.";
		} else if (1023 <= dob && dob <= 1121) {
			theTruth = "Scorpio - Trust the Al Gore rhythm, otherwise much debugging is in your future.";
		} else if (1122 <= dob && dob <= 1221) {
			theTruth = "Sagittarius - The real Truth lies within the nested if-statements of the heart.";
		} else {
			theTruth = "Capricorn - Your Strings will concatenate into 'Success' on this compilation.";
		}
		return theTruth;
	
	}
}
