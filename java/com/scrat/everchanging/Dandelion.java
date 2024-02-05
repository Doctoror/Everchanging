package com.scrat.everchanging;

import android.content.Context;

import com.scrat.everchanging.util.ReusableIterator;

import java.util.Calendar;

public class Dandelion extends TextureObject {

    private final float[][] matrixTransform = {
            // scaleX, scaleY, rotateSkew0, rotateSkew1,translateX, translateY
            {1.0000f, 1.0000f, 0.0000f, 0.0000f, -325.7f, -314.15f},
            {0.9957f, 0.9957f, 0.0000f, 0.0000f, -322.3f, -306.95f},
            {0.9914f, 0.9914f, 0.0000f, 0.0000f, -318.95f, -300.05f},
            {0.9871f, 0.9871f, 0.0000f, 0.0000f, -315.5f, -293.1f},
            {0.9827f, 0.9827f, 0.0000f, 0.0000f, -312f, -286.25f},
            {0.9784f, 0.9784f, 0.0000f, 0.0000f, -308.45f, -279.3f},
            {0.9741f, 0.9741f, 0.0000f, 0.0000f, -304.8f, -272.4f},
            {0.9698f, 0.9698f, 0.0000f, 0.0000f, -301.1f, -265.65f},
            {0.9655f, 0.9655f, 0.0000f, 0.0000f, -297.35f, -258.8f},
            {0.9612f, 0.9612f, 0.0000f, 0.0000f, -293.55f, -252.1f},
            {0.9568f, 0.9568f, 0.0000f, 0.0000f, -289.65f, -245.3f},
            {0.9525f, 0.9525f, 0.0000f, 0.0000f, -285.7f, -238.6f},
            {0.9482f, 0.9482f, 0.0000f, 0.0000f, -281.7f, -231.95f},
            {0.9439f, 0.9439f, 0.0000f, 0.0000f, -277.6f, -225.3f},
            {0.9396f, 0.9396f, 0.0000f, 0.0000f, -273.45f, -218.7f},
            {0.9353f, 0.9353f, 0.0000f, 0.0000f, -269.15f, -212.15f},
            {0.931f, 0.931f, 0.0000f, 0.0000f, -264.8f, -205.55f},
            {0.9267f, 0.9267f, 0.0000f, 0.0000f, -260.4f, -199.15f},
            {0.9223f, 0.9223f, 0.0000f, 0.0000f, -255.95f, -192.7f},
            {0.918f, 0.918f, 0.0000f, 0.0000f, -251.35f, -186.3f},
            {0.9137f, 0.9137f, 0.0000f, 0.0000f, -246.7f, -180f},
            {0.9094f, 0.9094f, 0.0000f, 0.0000f, -241.95f, -173.7f},
            {0.9051f, 0.9051f, 0.0000f, 0.0000f, -237.15f, -167.5f},
            {0.9008f, 0.9008f, 0.0000f, 0.0000f, -232.25f, -161.35f},
            {0.8965f, 0.8965f, 0.0000f, 0.0000f, -227.2f, -155.15f},
            {0.8921f, 0.8921f, 0.0000f, 0.0000f, -222.1f, -149.15f},
            {0.8878f, 0.8878f, 0.0000f, 0.0000f, -216.9f, -143.15f},
            {0.8835f, 0.8835f, 0.0000f, 0.0000f, -211.6f, -137.3f},
            {0.8792f, 0.8792f, 0.0000f, 0.0000f, -206.2f, -131.45f},
            {0.8749f, 0.8749f, 0.0000f, 0.0000f, -200.75f, -125.65f},
            {0.8706f, 0.8706f, 0.0000f, 0.0000f, -195.15f, -120.05f},
            {0.8662f, 0.8662f, 0.0000f, 0.0000f, -189.45f, -114.4f},
            {0.8619f, 0.8619f, 0.0000f, 0.0000f, -183.65f, -108.9f},
            {0.8576f, 0.8576f, 0.0000f, 0.0000f, -177.75f, -103.45f},
            {0.8533f, 0.8533f, 0.0000f, 0.0000f, -171.7f, -98.15f},
            {0.849f, 0.849f, 0.0000f, 0.0000f, -165.65f, -92.95f},
            {0.8447f, 0.8447f, 0.0000f, 0.0000f, -159.4f, -87.85f},
            {0.8403f, 0.8403f, 0.0000f, 0.0000f, -153.05f, -82.85f},
            {0.836f, 0.836f, 0.0000f, 0.0000f, -146.7f, -77.95f},
            {0.8317f, 0.8317f, 0.0000f, 0.0000f, -140.15f, -73.15f},
            {0.8274f, 0.8274f, 0.0000f, 0.0000f, -133.45f, -68.55f},
            {0.8231f, 0.8231f, 0.0000f, 0.0000f, -126.75f, -64f},
            {0.8188f, 0.8188f, 0.0000f, 0.0000f, -119.9f, -59.55f},
            {0.8145f, 0.8145f, 0.0000f, 0.0000f, -112.85f, -55.35f},
            {0.8102f, 0.8102f, 0.0000f, 0.0000f, -105.85f, -51.2f},
            {0.8058f, 0.8058f, 0.0000f, 0.0000f, -98.7f, -47.25f},
            {0.8015f, 0.8015f, 0.0000f, 0.0000f, -91.4f, -43.45f},
            {0.7972f, 0.7972f, 0.0000f, 0.0000f, -84.05f, -39.75f},
            {0.7929f, 0.7929f, 0.0000f, 0.0000f, -76.65f, -36.3f},
            {0.7886f, 0.7886f, 0.0000f, 0.0000f, -69.1f, -32.95f},
            {0.7843f, 0.7843f, 0.0000f, 0.0000f, -61.45f, -29.7f},
            {0.78f, 0.78f, 0.0000f, 0.0000f, -53.85f, -26.7f},
            {0.7756f, 0.7756f, 0.0000f, 0.0000f, -46f, -23.85f},
            {0.7713f, 0.7713f, 0.0000f, 0.0000f, -38.1f, -21.2f},
            {0.767f, 0.767f, 0.0000f, 0.0000f, -30.25f, -18.7f},
            {0.7627f, 0.7627f, 0.0000f, 0.0000f, -22.25f, -16.4f},
            {0.7584f, 0.7584f, 0.0000f, 0.0000f, -14.15f, -14.25f},
            {0.7541f, 0.7541f, 0.0000f, 0.0000f, -6.1f, -12.25f},
            {0.7497f, 0.7497f, 0.0000f, 0.0000f, 2.05f, -10.5f},
            {0.7454f, 0.7454f, 0.0000f, 0.0000f, 10.25f, -8.8f},
            {0.7411f, 0.7411f, 0.0000f, 0.0000f, 18.5f, -7.4f},
            {0.7368f, 0.7368f, 0.0000f, 0.0000f, 26.75f, -6.1f},
            {0.7325f, 0.7325f, 0.0000f, 0.0000f, 35.1f, -5f},
            {0.7282f, 0.7282f, 0.0000f, 0.0000f, 43.45f, -4.15f},
            {0.7239f, 0.7239f, 0.0000f, 0.0000f, 51.75f, -3.35f},
            {0.7195f, 0.7195f, 0.0000f, 0.0000f, 60.15f, -2.8f},
            {0.7152f, 0.7152f, 0.0000f, 0.0000f, 68.5f, -2.4f},
            {0.7109f, 0.7109f, 0.0000f, 0.0000f, 76.85f, -2.15f},
            {0.7066f, 0.7066f, 0.0000f, 0.0000f, 85.25f, -2f},
            {0.7023f, 0.7023f, 0.0000f, 0.0000f, 93.65f, -2.05f},
            {0.698f, 0.698f, 0.0000f, 0.0000f, 102.05f, -2.25f},
            {0.6936f, 0.6936f, 0.0000f, 0.0000f, 110.45f, -2.65f},
            {0.6893f, 0.6893f, 0.0000f, 0.0000f, 118.8f, -3.15f},
            {0.685f, 0.685f, 0.0000f, 0.0000f, 127.2f, -3.85f},
            {0.6807f, 0.6807f, 0.0000f, 0.0000f, 135.5f, -4.6f},
            {0.6764f, 0.6764f, 0.0000f, 0.0000f, 143.8f, -5.5f},
            {0.6721f, 0.6721f, 0.0000f, 0.0000f, 152.15f, -6.6f},
            {0.6678f, 0.6678f, 0.0000f, 0.0000f, 160.4f, -7.75f},
            {0.6635f, 0.6635f, 0.0000f, 0.0000f, 168.65f, -9.05f},
            {0.6591f, 0.6591f, 0.0000f, 0.0000f, 176.9f, -10.45f},
            {0.6548f, 0.6548f, 0.0000f, 0.0000f, 185.15f, -11.95f},
            {0.6505f, 0.6505f, 0.0000f, 0.0000f, 193.3f, -13.65f},
            {0.6462f, 0.6462f, 0.0000f, 0.0000f, 201.5f, -15.35f},
            {0.6419f, 0.6419f, 0.0000f, 0.0000f, 209.65f, -17.25f},
            {0.6376f, 0.6376f, 0.0000f, 0.0000f, 217.65f, -19.2f},
            {0.6332f, 0.6332f, 0.0000f, 0.0000f, 225.75f, -21.25f},
            {0.6289f, 0.6289f, 0.0000f, 0.0000f, 233.8f, -23.45f},
            {0.6246f, 0.6246f, 0.0000f, 0.0000f, 241.75f, -25.6f},
            {0.6203f, 0.6203f, 0.0000f, 0.0000f, 249.75f, -27.95f},
            {0.616f, 0.616f, 0.0000f, 0.0000f, 257.7f, -30.35f},
            {0.6117f, 0.6117f, 0.0000f, 0.0000f, 265.6f, -32.85f},
            {0.6074f, 0.6074f, 0.0000f, 0.0000f, 273.45f, -35.45f},
            {0.603f, 0.603f, 0.0000f, 0.0000f, 281.3f, -38.1f},
            {0.5987f, 0.5987f, 0.0000f, 0.0000f, 289.1f, -40.85f},
            {0.5944f, 0.5944f, 0.0000f, 0.0000f, 296.85f, -43.7f},
            {0.5901f, 0.5901f, 0.0000f, 0.0000f, 304.6f, -46.55f},
            {0.5858f, 0.5858f, 0.0000f, 0.0000f, 312.3f, -49.45f},
            {0.5815f, 0.5815f, 0.0000f, 0.0000f, 319.95f, -52.45f},
            {0.5771f, 0.5771f, 0.0000f, 0.0000f, 327.6f, -55.55f},
            {0.5728f, 0.5728f, 0.0000f, 0.0000f, 335.2f, -58.7f},
            {0.5685f, 0.5685f, 0.0000f, 0.0000f, 342.8f, -61.9f},
            {0.5642f, 0.5642f, 0.0000f, 0.0000f, 350.35f, -65.2f},
            {0.5599f, 0.5599f, 0.0000f, 0.0000f, 357.85f, -68.5f},
            {0.5556f, 0.5556f, 0.0000f, 0.0000f, 365.3f, -71.85f},
            {0.5513f, 0.5513f, 0.0000f, 0.0000f, 372.75f, -75.3f},
            {0.547f, 0.547f, 0.0000f, 0.0000f, 380.15f, -78.7f},
            {0.5426f, 0.5426f, 0.0000f, 0.0000f, 387.5f, -82.25f},
            {0.5383f, 0.5383f, 0.0000f, 0.0000f, 394.9f, -85.85f},
            {0.534f, 0.534f, 0.0000f, 0.0000f, 402.2f, -89.45f},
            {0.5297f, 0.5297f, 0.0000f, 0.0000f, 409.55f, -93.15f},
            {0.5254f, 0.5254f, 0.0000f, 0.0000f, 416.8f, -96.85f},
            {0.5211f, 0.5211f, 0.0000f, 0.0000f, 424f, -100.55f},
            {0.5168f, 0.5168f, 0.0000f, 0.0000f, 431.25f, -104.4f},
            {0.5124f, 0.5124f, 0.0000f, 0.0000f, 438.4f, -108.25f},
            {0.5081f, 0.5081f, 0.0000f, 0.0000f, 445.55f, -112.15f},
            {0.5038f, 0.5038f, 0.0000f, 0.0000f, 452.65f, -116f},
            {0.4995f, 0.4995f, 0.0000f, 0.0000f, 459.75f, -120f},
            {0.4952f, 0.4952f, 0.0000f, 0.0000f, 466.8f, -123.95f},
            {0.4909f, 0.4909f, 0.0000f, 0.0000f, 473.9f, -128f},
            {0.4865f, 0.4865f, 0.0000f, 0.0000f, 480.9f, -132.1f},
            {0.4822f, 0.4822f, 0.0000f, 0.0000f, 487.85f, -136.15f},
            {0.4779f, 0.4779f, 0.0000f, 0.0000f, 494.85f, -140.3f},
            {0.4736f, 0.4736f, 0.0000f, 0.0000f, 501.8f, -144.5f},
            {0.4693f, 0.4693f, 0.0000f, 0.0000f, 508.65f, -148.65f},
            {0.465f, 0.465f, 0.0000f, 0.0000f, 515.55f, -152.85f},
            {0.4606f, 0.4606f, 0.0000f, 0.0000f, 522.45f, -157.1f},
            {0.4563f, 0.4563f, 0.0000f, 0.0000f, 529.25f, -161.4f},
            {0.452f, 0.452f, 0.0000f, 0.0000f, 536.1f, -165.75f},
            {0.4477f, 0.4477f, 0.0000f, 0.0000f, 542.9f, -170.05f},
            {0.4434f, 0.4434f, 0.0000f, 0.0000f, 549.65f, -174.45f},
            {0.4391f, 0.4391f, 0.0000f, 0.0000f, 556.4f, -178.85f},
            {0.4348f, 0.4348f, 0.0000f, 0.0000f, 563.15f, -183.25f},
            {0.4305f, 0.4305f, 0.0000f, 0.0000f, 569.85f, -187.7f},
            {0.4261f, 0.4261f, 0.0000f, 0.0000f, 576.5f, -192.15f},
            {0.4218f, 0.4218f, 0.0000f, 0.0000f, 583.15f, -196.65f},
            {0.4175f, 0.4175f, 0.0000f, 0.0000f, 589.8f, -201.15f},
            {0.4132f, 0.4132f, 0.0000f, 0.0000f, 596.4f, -205.7f},
            {0.4089f, 0.4089f, 0.0000f, 0.0000f, 603.05f, -210.3f},
            {0.4046f, 0.4046f, 0.0000f, 0.0000f, 609.6f, -214.85f},
            {0.4003f, 0.4003f, 0.0000f, 0.0000f, 616.15f, -219.5f},
            {0.3959f, 0.3959f, 0.0000f, 0.0000f, 622.7f, -224.15f},
            {0.3916f, 0.3916f, 0.0000f, 0.0000f, 629.2f, -228.75f},
            {0.3873f, 0.3873f, 0.0000f, 0.0000f, 635.7f, -233.45f},
            {0.383f, 0.383f, 0.0000f, 0.0000f, 642.15f, -238.1f},
            {0.3787f, 0.3787f, 0.0000f, 0.0000f, 648.65f, -242.8f},
            {0.3744f, 0.3744f, 0.0000f, 0.0000f, 655.05f, -247.55f},
            {0.37f, 0.37f, 0.0000f, 0.0000f, 661.5f, -252.3f},
            {0.3657f, 0.3657f, 0.0000f, 0.0000f, 667.9f, -257.1f},
            {0.3614f, 0.3614f, 0.0000f, 0.0000f, 674.3f, -261.9f},
            {0.3571f, 0.3571f, 0.0000f, 0.0000f, 680.65f, -266.65f},
            {0.3528f, 0.3528f, 0.0000f, 0.0000f, 687.05f, -271.55f},
            {0.3485f, 0.3485f, 0.0000f, 0.0000f, 693.35f, -276.35f},
            {0.3442f, 0.3442f, 0.0000f, 0.0000f, 699.65f, -281.2f},
            {0.3398f, 0.3398f, 0.0000f, 0.0000f, 705.95f, -286.05f},
            {0.3355f, 0.3355f, 0.0000f, 0.0000f, 712.25f, -290.9f},
            {0.3312f, 0.3312f, 0.0000f, 0.0000f, 718.55f, -295.85f},
            {0.3269f, 0.3269f, 0.0000f, 0.0000f, 724.8f, -300.75f},
            {0.3226f, 0.3226f, 0.0000f, 0.0000f, 731.05f, -305.75f},
            {0.3183f, 0.3183f, 0.0000f, 0.0000f, 737.2f, -310.65f},
            {0.3139f, 0.3139f, 0.0000f, 0.0000f, 743.45f, -315.6f},
            {0.3096f, 0.3096f, 0.0000f, 0.0000f, 749.6f, -320.6f},
            {0.3053f, 0.3053f, 0.0000f, 0.0000f, 755.8f, -325.55f},
            {0.301f, 0.301f, 0.0000f, 0.0000f, 761.95f, -330.6f},
            {0.2967f, 0.2967f, 0.0000f, 0.0000f, 768.05f, -335.6f},
            {0.2924f, 0.2924f, 0.0000f, 0.0000f, 774.2f, -340.6f},
            {0.2881f, 0.2881f, 0.0000f, 0.0000f, 780.35f, -345.7f},
            {0.2838f, 0.2838f, 0.0000f, 0.0000f, 786.45f, -350.75f},
            {0.2794f, 0.2794f, 0.0000f, 0.0000f, 792.55f, -355.85f},
            {0.2751f, 0.2751f, 0.0000f, 0.0000f, 798.6f, -360.9f},
            {0.2708f, 0.2708f, 0.0000f, 0.0000f, 804.65f, -366f},
            {0.2665f, 0.2665f, 0.0000f, 0.0000f, 810.7f, -371.1f},
            {0.2622f, 0.2622f, 0.0000f, 0.0000f, 816.7f, -376.2f},
            {0.2579f, 0.2579f, 0.0000f, 0.0000f, 822.7f, -381.3f},
            {0.2535f, 0.2535f, 0.0000f, 0.0000f, 828.75f, -386.5f},
            {0.2492f, 0.2492f, 0.0000f, 0.0000f, 834.8f, -391.65f},
            {0.2449f, 0.2449f, 0.0000f, 0.0000f, 840.7f, -396.85f},
            {0.2406f, 0.2406f, 0.0000f, 0.0000f, 846.7f, -402f},
            {0.2363f, 0.2363f, 0.0000f, 0.0000f, 852.65f, -407.2f},
            {0.232f, 0.232f, 0.0000f, 0.0000f, 858.55f, -412.4f},
            {0.2277f, 0.2277f, 0.0000f, 0.0000f, 864.5f, -417.55f},
            {0.2233f, 0.2233f, 0.0000f, 0.0000f, 870.4f, -422.8f},
            {0.219f, 0.219f, 0.0000f, 0.0000f, 876.25f, -428f},
            {0.2147f, 0.2147f, 0.0000f, 0.0000f, 882.15f, -433.25f},
            {0.2104f, 0.2104f, 0.0000f, 0.0000f, 888.1f, -438.55f},
            {0.2061f, 0.2061f, 0.0000f, 0.0000f, 894f, -443.8f},
            {0.2018f, 0.2018f, 0.0000f, 0.0000f, 899.8f, -449.1f},
            {0.1974f, 0.1974f, 0.0000f, 0.0000f, 905.65f, -454.35f},
            {0.1931f, 0.1931f, 0.0000f, 0.0000f, 911.5f, -459.6f},
            {0.1888f, 0.1888f, 0.0000f, 0.0000f, 917.25f, -464.9f},
            {0.1845f, 0.1845f, 0.0000f, 0.0000f, 923.1f, -470.2f},
            {0.1802f, 0.1802f, 0.0000f, 0.0000f, 928.9f, -475.5f},
            {0.1759f, 0.1759f, 0.0000f, 0.0000f, 934.65f, -480.85f},
            {0.1716f, 0.1716f, 0.0000f, 0.0000f, 940.45f, -486.2f},
            {0.1673f, 0.1673f, 0.0000f, 0.0000f, 946.25f, -491.55f},
            {0.1629f, 0.1629f, 0.0000f, 0.0000f, 951.95f, -496.9f},
            {0.1586f, 0.1586f, 0.0000f, 0.0000f, 957.75f, -502.3f},
            {0.1543f, 0.1543f, 0.0000f, 0.0000f, 963.45f, -507.65f},
            {0.15f, 0.15f, 0.0000f, 0.0000f, 968.85f, -513.55f}
    };

    static private final String[][] textureList = {{"shape_107", "shape_108", "shape_109", "shape_110", "shape_111", "shape_112",
            "shape_113", "shape_114", "shape_115", "shape_116", "shape_117", "shape_118", "shape_119", "shape_120",
            "shape_121", "shape_122", "shape_123", "shape_124", "shape_125", "shape_126", "shape_127", "shape_128",
            "shape_129", "shape_130", "shape_131", "shape_132", "shape_133", "shape_134", "shape_135", "shape_136",
            "shape_137", "shape_138", "shape_139", "shape_140", "shape_141", "shape_142"}};
    static private final float[][] pivotList = {{259.15f, 167.95f}, {257.1f, 171.25f}, {255.1f, 174.35f}, {254.0f, 177.35f}, {253.8f, 180.2f}, {253.65f, 182.95f},
            {257.0f, 185.5f}, {262.35f, 187.95f}, {267.75f, 190.25f}, {262.7f, 189.55f}, {257.7f, 188.9f}, {249.4f, 188.2f}, {248.15f, 187.55f}, {246.9f, 186.85f},
            {245.65f, 186.2f}, {245.7f, 185.5f}, {245.8f, 184.85f}, {245.9f, 184.15f}, {243.7f, 182.35f}, {241.55f, 185.2f}, {239.35f, 188.1f}, {237.2f, 190.95f},
            {235.0f, 193.8f}, {232.85f, 190.05f}, {234.25f, 186.3f}, {237.25f, 188.75f}, {240.3f, 192.65f}, {243.3f, 196.6f}, {244.5f, 191.2f}, {245.7f, 185.75f},
            {246.9f, 180.2f}, {248.15f, 174.55f}, {249.4f, 168.8f}, {250.7f, 167.25f}, {252.0f, 165.9f}, {256.2f, 164.5f}};
    private final float[][][] animationStartColor = {
            //{redMultiTerm, greenMultiTerm, blueMultiTerm, alphaMultiTerm},{redAddTerm, greenAddTerm, blueAddTerm, alphaAddTerm}
            {{0, 0, 0, 256}, {0, 0, 0, 0}},
            {{28, 28, 28, 256}, {0, 0, 0, 0}},
            {{57, 57, 57, 256}, {0, 0, 0, 0}},
            {{85, 85, 85, 256}, {0, 0, 0, 0}},
            {{114, 114, 114, 256}, {0, 0, 0, 0}},
            {{142, 142, 142, 256}, {0, 0, 0, 0}},
            {{171, 171, 171, 256}, {0, 0, 0, 0}},
            {{199, 199, 199, 256}, {0, 0, 0, 0}},
            {{228, 228, 228, 256}, {0, 0, 0, 0}},
            {{256, 256, 256, 256}, {0, 0, 0, 0}}
    };
    private final float[] animationStartPosition = {0.15f, 0.15f, 0.0000f, 0.0000f, 38.55f, 24.85f};

    private final Calendar calendar;

    int frameCounter = 0;
    int maxFrames = 7;
    int numClips = minObjects;
    boolean init = false;
    float svgScale = 1.0f;
    public Dandelion(Context context, final Calendar calendar) {
        super(context, textureList, pivotList);
        this.calendar = calendar;
    }

    void createObject() {
        if (objects.objectsInUseCount() >= numClips) return;
        int textureIndex = textureManager.getTextureIndex(textureList[0][0]);
        final Object object = objects.obtain(textureManager.getTexture(textureIndex), 1.0f);
        object.setObjectScale(1.0f/svgScale);
        int _x = 0;
        int _y = random.nextInt(height);
        int _rotation = random.nextInt(30) - 15;
        int _yscale = random.nextInt(90);
        object.index = (int) (_yscale / 10 + 0.5f);
        object.resetViewMatrix();
        object.setViewScale(_yscale, _yscale);
        object.setViewRotate(_rotation);
        object.setViewPosition(_x,  _y);
        object.setColorTransform(animationStartColor[object.index]);
        object.animCounter = 0;
        object.frameCounter = 0;
     }

    private boolean get1902() {
        svgScale = textureManager.dipToPixels(1);
        int currentMonth = calendar.get(Calendar.MONTH) + 1;
        int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
        return (currentMonth==2) && (currentDay==19);
    }

    public void update(boolean createObject) {
        frameCounter = (frameCounter+1) % maxFrames;
        if (!init && createObject)  numClips = get1902()?maxObjects:(minObjects + random.nextInt(maxObjects - 4));
        init = createObject;
        if (createObject && frameCounter==2) createObject();

        final ReusableIterator<Object> iterator = objects.iterator();
        iterator.acquire();

        while (iterator.hasNext()) {
            final Object object = iterator.next();
            object.resetMatrix();
            object.setTexture(textureManager.getTexture(textureManager.getTextureIndex(textureList[0][object.animCounter])), 1.0f);
            object.setTransform(animationStartPosition);
            object.setTransform(matrixTransform[object.frameCounter]);
            object.frameCounter = (object.frameCounter+1) % matrixTransform.length;
            object.animCounter = (object.animCounter+1) % textureList[0].length;
            if (!createObject && (object.frameCounter == 0)) iterator.remove();
        }

        iterator.release();
    }
}
