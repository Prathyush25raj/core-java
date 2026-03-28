class Speaker
{
    static String speakerNames[] = {
        "Sony SRS-XB13",
        "JBL Flip 6",
        "Boat Stone 650",
        "Mi Portable Speaker",
        "Marshall Emberton",
        "Bose SoundLink",
        "Ultimate Ears Boom",
        "Philips BT50"
    };

    static float speakerPrice[] = {
        3500f, 9000f, 2500f, 2000f, 15000f, 12000f, 10000f, 1800f
    };

    static double speakerRatings[] = {
        4.4,4.6,4.3,4.2,4.7,4.6,4.5,4.1
    };

    static String speakerBrand[] = {
        "Sony","JBL","Boat","Mi","Marshall","Bose","Ultimate Ears","Philips"
    };

    public static void getSpeakerDetails()
    {
        for(int i=0;i<speakerNames.length;i++)
        {
            System.out.println(speakerNames[i]+" | "+speakerPrice[i]+" | "+speakerRatings[i]+" | "+speakerBrand[i]);
		}
	}
}