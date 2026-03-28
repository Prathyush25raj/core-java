class Camera
{
    static String cameraNames[] = {
        "Canon EOS 1500D",
        "Nikon D3500",
        "Sony Alpha A7",
        "Fujifilm X-T200",
        "Panasonic Lumix G7",
        "Canon EOS R6",
        "Sony ZV-E10",
        "Nikon Z50"
    };

    static float cameraPrice[] = {
        42000f, 45000f, 120000f, 70000f, 65000f, 200000f, 80000f, 95000f
    };

    static double cameraRatings[] = {
        4.5,4.4,4.7,4.6,4.4,4.8,4.6,4.5
    };

    static String cameraBrand[] = {
        "Canon","Nikon","Sony","Fujifilm","Panasonic","Canon","Sony","Nikon"
    };

    public static void getCameraDetails()
    {
        for(int i=0;i<cameraNames.length;i++)
        {
            System.out.println(cameraNames[i]+" | "+cameraPrice[i]+" | "+cameraRatings[i]+" | "+cameraBrand[i]);
        }
    }
}