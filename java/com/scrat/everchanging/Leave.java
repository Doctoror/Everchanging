package com.scrat.everchanging;

import android.content.Context;

import java.util.ArrayList;
import java.util.Calendar;

public class Leave extends TextureObject {
    static private final String[][] textureList = {{
            "shape_59", "shape_60", "shape_61", "shape_62", "shape_63", "shape_64", "shape_65", "shape_66",
            "shape_67", "shape_68", "shape_69", "shape_70", "shape_71", "shape_72", "shape_73", "shape_74",
            "shape_75", "shape_76", "shape_77", "shape_78", "shape_79", "shape_80", "shape_81", "shape_82",
            "shape_83", "shape_84", "shape_85", "shape_86", "shape_87", "shape_88", "shape_89", "shape_90",
            "shape_91", "shape_92", "shape_93", "shape_94", "shape_95", "shape_96", "shape_97",
            "shape_99", "shape_100", "shape_101", "shape_102", "shape_103",
            "shape_280", "shape_281", "shape_282", "shape_283", "shape_284", "shape_285", "shape_286", "shape_287",
            "shape_288", "shape_289", "shape_290", "shape_291", "shape_292", "shape_293", "shape_294", "shape_295",
            "shape_296"}};
    private final String[][] AnimateTextureList = {
            {
                    "shape_280", "shape_281", "shape_282", "shape_283", "shape_284", "shape_285", "shape_286", "shape_287",
                    "shape_288", "shape_289", "shape_290", "shape_291", "shape_292", "shape_293", "shape_294", "shape_295",
                    "shape_296", "shape_99", "shape_100", "shape_101", "shape_102", "shape_103"
            },
            {
                    "shape_59", "shape_60", "shape_61", "shape_62", "shape_63", "shape_64", "shape_65", "shape_66",
                    "shape_67", "shape_68", "shape_69", "shape_70", "shape_71", "shape_72", "shape_73", "shape_74",
                    "shape_75", "shape_76", "shape_77", "shape_77", "shape_77", "shape_77", "shape_77", "shape_77",
                    "shape_77", "shape_77", "shape_77", "shape_77", "shape_77", "shape_77", "shape_78", "shape_79",
                    "shape_80", "shape_81", "shape_82", "shape_83", "shape_84", "shape_85", "shape_86", "shape_87",
                    "shape_88", "shape_89", "shape_90", "shape_91", "shape_92", "shape_93", "shape_94", "shape_95",
                    "shape_96", "shape_59", "shape_60", "shape_61", "shape_62", "shape_63", "shape_64", "shape_65",
                    "shape_66", "shape_67", "shape_68", "shape_69", "shape_70", "shape_71", "shape_72", "shape_73",
                    "shape_74", "shape_75", "shape_76", "shape_77", "shape_77", "shape_77", "shape_77", "shape_77",
                    "shape_77", "shape_77", "shape_77", "shape_77", "shape_77", "shape_77", "shape_77", "shape_78",
                    "shape_79", "shape_80", "shape_81", "shape_82", "shape_83", "shape_84", "shape_85", "shape_86",
                    "shape_87", "shape_88", "shape_89", "shape_90", "shape_91", "shape_92", "shape_93", "shape_94",
                    "shape_95", "shape_96", "shape_59", "shape_60", "shape_61", "shape_62", "shape_63", "shape_64",
                    "shape_65", "shape_66", "shape_67", "shape_68", "shape_69", "shape_70"
            }
    };
    private final float[][][] AnimatedTextureMatrix = {
            {
                    {1.0000f, 1.0000f, 0.0000f, 0.0000f, -5.05f, 6.05f},
                    {1.0000f, 1.0000f, 0.0000f, 0.0000f, -5.05f, 6.05f},
                    {1.0000f, 1.0000f, 0.0000f, 0.0000f, -5.05f, 6.05f},
                    {1.0000f, 1.0000f, 0.0000f, 0.0000f, -5.05f, 6.05f},
                    {1.0000f, 1.0000f, 0.0000f, 0.0000f, -5.05f, 6.05f},
                    {1.0000f, 1.0000f, 0.0000f, 0.0000f, -5.05f, 6.05f},
                    {1.0000f, 1.0000f, 0.0000f, 0.0000f, -5.05f, 6.05f},
                    {1.0000f, 1.0000f, 0.0000f, 0.0000f, -5.05f, 6.05f},
                    {1.0000f, 1.0000f, 0.0000f, 0.0000f, -5.05f, 6.05f},
                    {1.0000f, 1.0000f, 0.0000f, 0.0000f, -5.05f, 6.05f},
                    {1.0000f, 1.0000f, 0.0000f, 0.0000f, -5.05f, 6.05f},
                    {1.0000f, 1.0000f, 0.0000f, 0.0000f, -5.05f, 6.05f},
                    {1.0000f, 1.0000f, 0.0000f, 0.0000f, -5.05f, 6.05f},
                    {1.0000f, 1.0000f, 0.0000f, 0.0000f, -5.05f, 6.05f},
                    {1.0000f, 1.0000f, 0.0000f, 0.0000f, -5.05f, 6.05f},
                    {1.0000f, 1.0000f, 0.0000f, 0.0000f, -5.05f, 6.05f},
                    {1.0000f, 1.0000f, 0.0000f, 0.0000f, -5.05f, 6.05f},
                    {1.0000f, 1.0000f, 0.0000f, 0.0000f, -6.65f, 141.9f},
                    {1.0000f, 1.0000f, 0.0000f, 0.0000f, -6.65f, 141.9f},
                    {1.0000f, 1.0000f, 0.0000f, 0.0000f, -6.65f, 141.9f},
                    {1.0000f, 1.0000f, 0.0000f, 0.0000f, -6.65f, 141.9f},
                    {1.0000f, 1.0000f, 0.0000f, 0.0000f, -6.65f, 141.9f}, //132
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f},
                    {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}, {0.0000f, 0.0000f, 0.0000f, 0.0000f, 0f, 0f}
            }, {
                    {0.09616f, 0.04999f, 0.0000f, 0.0000f, 21.75f, -140.05f},
                    {0.1034f, 0.0594f, 0.0000f, 0.0000f, 19.75f, -136.8f},
                    {0.1114f, 0.06982f, 0.0000f, 0.0000f, 17.35f, -133.35f},
                    {0.1202f, 0.08124f, 0.0000f, 0.0000f, 14.5f, -129.7f},
                    {0.1297f, 0.09364f, 0.0000f, 0.0000f, 11.2f, -125.9f},
                    {0.14f, 0.107f, 0.0000f, 0.0000f, 7.4f, -122.05f},
                    {0.1511f, 0.1214f, 0.0000f, 0.0000f, 2.95f, -118.3f},
                    {0.1629f, 0.1368f, 0.0000f, 0.0000f, -2.3f, -114.95f},
                    {0.1755f, 0.1532f, 0.0000f, 0.0000f, -8.35f, -112.1f},
                    {0.1889f, 0.1706f, 0.0000f, 0.0000f, -15.1f, -110f},
                    {0.203f, 0.1889f, 0.0000f, 0.0000f, -22.4f, -108.2f},
                    {0.2179f, 0.2083f, 0.0000f, 0.0000f, -29.8f, -105.8f},
                    {0.2336f, 0.2287f, 0.0000f, 0.0000f, -37.45f, -102.65f},
                    {0.25f, 0.25f, 0.0000f, 0.0000f, -45.1f, -98.6f},
                    {0.24f, 0.24f, 0.0000f, 0.0000f, -50.4f, -95.2f},
                    {0.23f, 0.23f, 0.0000f, 0.0000f, -55.4f, -91.4f},
                    {0.22f, 0.22f, 0.0000f, 0.0000f, -60f, -87.25f},
                    {0.21f, 0.21f, 0.0000f, 0.0000f, -63.1f, -81.95f},
                    {0.11f, 0.2f, 0.0000f, 0.0000f, -63.5f, -75.65f},
                    {0.09839f, 0.1849f, 0.02283f, -0.04289f, -61.3f, -69.6f},
                    {0.0784f, 0.1542f, 0.04677f, -0.092f, -57.75f, -64.3f},
                    {0.04893f, 0.1023f, 0.06467f, -0.1351f, -53.8f, -59.4f},
                    {0.01318f, 0.02979f, 0.06938f, -0.1567f, -49.3f, -54.9f},
                    {-0.02054f, -0.05125f, 0.0563f, -0.1405f, -44.25f, -50.95f},
                    {-0.05788f, -0.1168f, 0.0377f, -0.07613f, -38.9f, -47.5f},
                    {-0.07506f, -0.1298f, 0.0007019f, -0.001205f, -33.15f, -44.6f},
                    {-0.06905f, -0.1061f, -0.03601f, 0.05536f, -27.2f, -42.35f},
                    {-0.04872f, -0.06848f, -0.061f, 0.08575f, -21.05f, -40.6f},
                    {-0.02483f, -0.03262f, -0.07185f, 0.09439f, -14.8f, -39.35f},
                    {-0.006073f, -0.007584f, -0.08684f, 0.1085f, -10.05f, -38.6f},
                    {0.1176f, 0.1176f, 0.0000f, 0.0000f, -5.3f, -38.1f},
                    {0.1265f, 0.1265f, 0.0000f, 0.0000f, -0.45f, -37.8f},
                    {0.1353f, 0.1353f, 0.0000f, 0.0000f, 4.35f, -37.75f},
                    {0.1441f, 0.1441f, 0.0000f, 0.0000f, 9.1f, -37.95f},
                    {0.1529f, 0.1529f, 0.0000f, 0.0000f, 13.9f, -38.4f},
                    {0.1618f, 0.1618f, 0.0000f, 0.0000f, 18.7f, -39.1f},
                    {0.1706f, 0.1706f, 0.0000f, 0.0000f, 23.45f, -40f},
                    {0.1794f, 0.1794f, 0.0000f, 0.0000f, 28.15f, -41.15f},
                    {0.1882f, 0.1882f, 0.0000f, 0.0000f, 32.75f, -42.55f},
                    {0.1971f, 0.1971f, 0.0000f, 0.0000f, 37.35f, -44.15f},
                    {0.2059f, 0.2059f, 0.0000f, 0.0000f, 41.8f, -45.95f},
                    {0.2147f, 0.2147f, 0.0000f, 0.0000f, 46.25f, -47.3f},
                    {0.2235f, 0.2235f, 0.0000f, 0.0000f, 50.95f, -47.05f},
                    {0.2323f, 0.2323f, 0.0000f, 0.0000f, 55f, -44.35f},
                    {0.2412f, 0.2412f, 0.0000f, 0.0000f, 57.6f, -40.25f},
                    {0.25f, 0.25f, 0.0000f, 0.0000f, 59.45f, -35.8f},
                    {0.2534f, 0.2534f, 0.0000f, 0.0000f, 60.6f, -29.7f},
                    {0.2568f, 0.2568f, 0.0000f, 0.0000f, 60f, -23.4f},
                    {0.2602f, 0.2602f, 0.0000f, 0.0000f, 57.45f, -17.55f},
                    {0.2636f, 0.2636f, 0.0000f, 0.0000f, 53.45f, -12.5f},
                    {0.267f, 0.267f, 0.0000f, 0.0000f, 48.7f, -8.35f},
                    {0.2704f, 0.2704f, 0.0000f, 0.0000f, 43.55f, -4.7f},
                    {0.2739f, 0.2739f, 0.0000f, 0.0000f, 38.1f, -1.55f},
                    {0.2773f, 0.2773f, 0.0000f, 0.0000f, 32.3f, 1f},
                    {0.2807f, 0.2807f, 0.0000f, 0.0000f, 26.2f, 2.9f},
                    {0.2841f, 0.2841f, 0.0000f, 0.0000f, 19.95f, 4.1f},
                    {0.2875f, 0.2875f, 0.0000f, 0.0000f, 13.5f, 4.6f},
                    {0.2909f, 0.2909f, 0.0000f, 0.0000f, 7.15f, 4.45f},
                    {0.2943f, 0.2943f, 0.0000f, 0.0000f, 0.8f, 3.7f},
                    {0.2977f, 0.2977f, 0.0000f, 0.0000f, -5.5f, 2.4f},
                    {0.3011f, 0.3011f, 0.0000f, 0.0000f, -11.65f, 0.65f},
                    {0.3046f, 0.3046f, 0.0000f, 0.0000f, -17.7f, -1.15f},
                    {0.308f, 0.308f, 0.0000f, 0.0000f, -23.85f, -2.6f},
                    {0.3114f, 0.3114f, 0.0000f, 0.0000f, -29.8f, -4.65f},
                    {0.3148f, 0.3148f, 0.0000f, 0.0000f, -35.55f, -7.3f},
                    {0.3182f, 0.3182f, 0.0000f, 0.0000f, -41.6f, -9.35f},
                    {0.3216f, 0.3216f, 0.0000f, 0.0000f, -47.75f, -10.8f},
                    {0.1787f, 0.325f, 0.0000f, 0.0000f, -53.9f, -10.65f},
                    {0.17f, 0.3195f, 0.03944f, -0.07414f, -59.45f, -7.85f},
                    {0.1445f, 0.2843f, 0.0862f, -0.1696f, -63.5f, -2.9f},
                    {0.0965f, 0.2016f, 0.1275f, -0.2665f, -65.3f, 3.25f},
                    {0.02791f, 0.06305f, 0.1469f, -0.3318f, -65.5f, 9.6f},
                    {-0.04684f, -0.1169f, 0.1284f, -0.3203f, -65.1f, 15.9f},
                    {-0.1428f, -0.2883f, 0.09305f, -0.1879f, -64.25f, 22.15f},
                    {-0.2015f, -0.3482f, 0.001877f, -0.003265f, -63f, 28.3f},
                    {-0.2027f, -0.3116f, -0.1057f, 0.1625f, -61.1f, 34.35f},
                    {-0.1576f, -0.2215f, -0.1973f, 0.2773f, -57.85f, 39.85f},
                    {-0.08916f, -0.1171f, -0.258f, 0.3389f, -53.4f, 44.55f},
                    {-0.02023f, -0.02528f, -0.2893f, 0.3616f, -48.25f, 48.45f},
                    {0.3659f, 0.3659f, 0.0000f, 0.0000f, -42.8f, 51.75f},
                    {0.3693f, 0.3693f, 0.0000f, 0.0000f, -37.15f, 54.5f},
                    {0.3727f, 0.3727f, 0.0000f, 0.0000f, -30.85f, 56.4f},
                    {0.3761f, 0.3761f, 0.0000f, 0.0000f, -24.45f, 57.4f},
                    {0.3795f, 0.3795f, 0.0000f, 0.0000f, -18f, 57.75f},
                    {0.3829f, 0.3829f, 0.0000f, 0.0000f, -11.5f, 57.55f},
                    {0.3864f, 0.3864f, 0.0000f, 0.0000f, -5.15f, 56.95f},
                    {0.3898f, 0.3898f, 0.0000f, 0.0000f, 1.2f, 56f},
                    {0.3932f, 0.3932f, 0.0000f, 0.0000f, 7.45f, 54.75f},
                    {0.3966f, 0.3966f, 0.0000f, 0.0000f, 13.6f, 53.45f},
                    {0.4f, 0.4f, 0.0000f, 0.0000f, 20.05f, 53.7f},
                    {0.3975f, 0.3975f, 0.0000f, 0.0000f, 26.25f, 54.2f},
                    {0.395f, 0.395f, 0.0000f, 0.0000f, 32.3f, 55.25f},
                    {0.3925f, 0.3925f, 0.0000f, 0.0000f, 38.2f, 57.05f},
                    {0.39f, 0.39f, 0.0000f, 0.0000f, 43.8f, 59.85f},
                    {0.3875f, 0.3875f, 0.0000f, 0.0000f, 48.5f, 64.05f},
                    {0.385f, 0.385f, 0.0000f, 0.0000f, 51.4f, 69.8f},
                    {0.3825f, 0.3825f, 0.0000f, 0.0000f, 52.05f, 76.2f},
                    {0.38f, 0.38f, 0.0000f, 0.0000f, 51.45f, 82.55f},
                    {0.3775f, 0.3775f, 0.0000f, 0.0000f, 50.25f, 88.75f},
                    {0.375f, 0.375f, 0.0000f, 0.0000f, 48.55f, 94.8f},
                    {0.3725f, 0.3725f, 0.0000f, 0.0000f, 46.1f, 100.65f},
                    {0.37f, 0.37f, 0.0000f, 0.0000f, 42.95f, 106.15f},
                    {0.3675f, 0.3675f, 0.0000f, 0.0000f, 39.05f, 111.25f},
                    {0.365f, 0.365f, 0.0000f, 0.0000f, 34.55f, 115.7f},
                    {0.3625f, 0.3625f, 0.0000f, 0.0000f, 29.95f, 119.9f},
                    {0.36f, 0.36f, 0.0000f, 0.0000f, 25.4f, 123.9f},
                    {0.3575f, 0.3575f, 0.0000f, 0.0000f, 20.65f, 127.95f},
                    {0.355f, 0.355f, 0.0000f, 0.0000f, 15.7f, 131.8f},
                    {0.3525f, 0.3525f, 0.0000f, 0.0000f, 10.4f, 135.55f},
                    {0.35f, 0.35f, 0.0000f, 0.0000f, 5.05f, 139.4f} //Frame 110
            },{
                    {0.35f, 0.35f, 0.0000f, 0.0000f, 5.05f, -139.4f}, //Frame 110
                    {0.3525f, 0.3525f, 0.0000f, 0.0000f, 10.4f, -135.55f},
                    {0.355f, 0.355f, 0.0000f, 0.0000f, 15.7f, -131.8f},
                    {0.3575f, 0.3575f, 0.0000f, 0.0000f, 20.65f, -127.95f},
                    {0.36f, 0.36f, 0.0000f, 0.0000f, 25.4f, -123.9f},
                    {0.3625f, 0.3625f, 0.0000f, 0.0000f, 29.95f, -119.9f},
                    {0.365f, 0.365f, 0.0000f, 0.0000f, 34.55f, -115.7f},
                    {0.3675f, 0.3675f, 0.0000f, 0.0000f, 39.05f, -111.25f},
                    {0.37f, 0.37f, 0.0000f, 0.0000f, 42.95f, -106.15f},
                    {0.3725f, 0.3725f, 0.0000f, 0.0000f, 46.1f, -100.65f},
                    {0.375f, 0.375f, 0.0000f, 0.0000f, 48.55f, -94.8f},
                    {0.3775f, 0.3775f, 0.0000f, 0.0000f, 50.25f, -88.75f},
                    {0.38f, 0.38f, 0.0000f, 0.0000f, 51.45f, -82.55f},
                    {0.3825f, 0.3825f, 0.0000f, 0.0000f, 52.05f, -76.2f},
                    {0.385f, 0.385f, 0.0000f, 0.0000f, 51.4f, -69.8f},
                    {0.3875f, 0.3875f, 0.0000f, 0.0000f, 48.5f, -64.05f},
                    {0.39f, 0.39f, 0.0000f, 0.0000f, 43.8f, -59.85f},
                    {0.3925f, 0.3925f, 0.0000f, 0.0000f, 38.2f, -57.05f},
                    {0.395f, 0.395f, 0.0000f, 0.0000f, 32.3f, -55.25f},
                    {0.3975f, 0.3975f, 0.0000f, 0.0000f, 26.25f, -54.2f},
                    {0.4f, 0.4f, 0.0000f, 0.0000f, 20.05f, -53.7f},
                    {0.3966f, 0.3966f, 0.0000f, 0.0000f, 13.6f, -53.45f},
                    {0.3932f, 0.3932f, 0.0000f, 0.0000f, 7.45f, -54.75f},
                    {0.3898f, 0.3898f, 0.0000f, 0.0000f, 1.2f, -56f},
                    {0.3864f, 0.3864f, 0.0000f, 0.0000f, -5.15f, -56.95f},
                    {0.3829f, 0.3829f, 0.0000f, 0.0000f, -11.5f, -57.55f},
                    {0.3795f, 0.3795f, 0.0000f, 0.0000f, -18f, -57.75f},
                    {0.3761f, 0.3761f, 0.0000f, 0.0000f, -24.45f, -57.4f},
                    {0.3727f, 0.3727f, 0.0000f, 0.0000f, -30.85f, -56.4f},
                    {0.3693f, 0.3693f, 0.0000f, 0.0000f, -37.15f, -54.5f},
                    {0.3659f, 0.3659f, 0.0000f, 0.0000f, -42.8f, -51.75f},
                    {-0.02023f, -0.02528f, -0.2893f, 0.3616f, -48.25f, -48.45f},
                    {-0.08916f, -0.1171f, -0.258f, 0.3389f, -53.4f, -44.55f},
                    {-0.1576f, -0.2215f, -0.1973f, 0.2773f, -57.85f, -39.85f},
                    {-0.2027f, -0.3116f, -0.1057f, 0.1625f, -61.1f, -34.35f},
                    {-0.2015f, -0.3482f, 0.001877f, -0.003265f, -63f, -28.3f},
                    {-0.1428f, -0.2883f, 0.09305f, -0.1879f, -64.25f, -22.15f},
                    {-0.04684f, -0.1169f, 0.1284f, -0.3203f, -65.1f, -15.9f},
                    {0.02791f, 0.06305f, 0.1469f, -0.3318f, -65.5f, -9.6f},
                    {0.0965f, 0.2016f, 0.1275f, -0.2665f, -65.3f, -3.25f},
                    {0.1445f, 0.2843f, 0.0862f, -0.1696f, -63.5f, 2.9f},
                    {0.17f, 0.3195f, 0.03944f, -0.07414f, -59.45f, 7.85f},
                    {0.1787f, 0.325f, 0.0000f, 0.0000f, -53.9f, 10.65f},
                    {0.3216f, 0.3216f, 0.0000f, 0.0000f, -47.75f, 10.8f},
                    {0.3182f, 0.3182f, 0.0000f, 0.0000f, -41.6f, 9.35f},
                    {0.3148f, 0.3148f, 0.0000f, 0.0000f, -35.55f, 7.3f},
                    {0.3114f, 0.3114f, 0.0000f, 0.0000f, -29.8f, 4.65f},
                    {0.308f, 0.308f, 0.0000f, 0.0000f, -23.85f, 2.6f},
                    {0.3046f, 0.3046f, 0.0000f, 0.0000f, -17.7f, 1.15f},
                    {0.3011f, 0.3011f, 0.0000f, 0.0000f, -11.65f, -0.65f},
                    {0.2977f, 0.2977f, 0.0000f, 0.0000f, -5.5f, -2.4f},
                    {0.2943f, 0.2943f, 0.0000f, 0.0000f, 0.8f, -3.7f},
                    {0.2909f, 0.2909f, 0.0000f, 0.0000f, 7.15f, -4.45f},
                    {0.2875f, 0.2875f, 0.0000f, 0.0000f, 13.5f, -4.6f},
                    {0.2841f, 0.2841f, 0.0000f, 0.0000f, 19.95f, -4.1f},
                    {0.2807f, 0.2807f, 0.0000f, 0.0000f, 26.2f, -2.9f},
                    {0.2773f, 0.2773f, 0.0000f, 0.0000f, 32.3f, -1f},
                    {0.2739f, 0.2739f, 0.0000f, 0.0000f, 38.1f, 1.55f},
                    {0.2704f, 0.2704f, 0.0000f, 0.0000f, 43.55f, 4.7f},
                    {0.267f, 0.267f, 0.0000f, 0.0000f, 48.7f, 8.35f},
                    {0.2636f, 0.2636f, 0.0000f, 0.0000f, 53.45f, 12.5f},
                    {0.2602f, 0.2602f, 0.0000f, 0.0000f, 57.45f, 17.55f},
                    {0.2568f, 0.2568f, 0.0000f, 0.0000f, 60f, 23.4f},
                    {0.2534f, 0.2534f, 0.0000f, 0.0000f, 60.6f, 29.7f},
                    {0.25f, 0.25f, 0.0000f, 0.0000f, 59.45f, 35.8f},
                    {0.2412f, 0.2412f, 0.0000f, 0.0000f, 57.6f, 40.25f},
                    {0.2323f, 0.2323f, 0.0000f, 0.0000f, 55f, 44.35f},
                    {0.2235f, 0.2235f, 0.0000f, 0.0000f, 50.95f, 47.05f},
                    {0.2147f, 0.2147f, 0.0000f, 0.0000f, 46.25f, 47.3f},
                    {0.2059f, 0.2059f, 0.0000f, 0.0000f, 41.8f, 45.95f},
                    {0.1971f, 0.1971f, 0.0000f, 0.0000f, 37.35f, 44.15f},
                    {0.1882f, 0.1882f, 0.0000f, 0.0000f, 32.75f, 42.55f},
                    {0.1794f, 0.1794f, 0.0000f, 0.0000f, 28.15f, 41.15f},
                    {0.1706f, 0.1706f, 0.0000f, 0.0000f, 23.45f, 40f},
                    {0.1618f, 0.1618f, 0.0000f, 0.0000f, 18.7f, 39.1f},
                    {0.1529f, 0.1529f, 0.0000f, 0.0000f, 13.9f, 38.4f},
                    {0.1441f, 0.1441f, 0.0000f, 0.0000f, 9.1f, 37.95f},
                    {0.1353f, 0.1353f, 0.0000f, 0.0000f, 4.35f, 37.75f},
                    {0.1265f, 0.1265f, 0.0000f, 0.0000f, -0.45f, 37.8f},
                    {0.1176f, 0.1176f, 0.0000f, 0.0000f, -5.3f, 38.1f},
                    {-0.006073f, -0.007584f, -0.08684f, 0.1085f, -10.05f, 38.6f},
                    {-0.02483f, -0.03262f, -0.07185f, 0.09439f, -14.8f, 39.35f},
                    {-0.04872f, -0.06848f, -0.061f, 0.08575f, -21.05f, 40.6f},
                    {-0.06905f, -0.1061f, -0.03601f, 0.05536f, -27.2f, 42.35f},
                    {-0.07506f, -0.1298f, 0.0007019f, -0.001205f, -33.15f, 44.6f},
                    {-0.05788f, -0.1168f, 0.0377f, -0.07613f, -38.9f, 47.5f},
                    {-0.02054f, -0.05125f, 0.0563f, -0.1405f, -44.25f, 50.95f},
                    {0.01318f, 0.02979f, 0.06938f, -0.1567f, -49.3f, 54.9f},
                    {0.04893f, 0.1023f, 0.06467f, -0.1351f, -53.8f, 59.4f},
                    {0.0784f, 0.1542f, 0.04677f, -0.092f, -57.75f, 64.3f},
                    {0.09839f, 0.1849f, 0.02283f, -0.04289f, -61.3f, 69.6f},
                    {0.11f, 0.2f, 0.0000f, 0.0000f, -63.5f, 75.65f},
                    {0.21f, 0.21f, 0.0000f, 0.0000f, -63.1f, 81.95f},
                    {0.22f, 0.22f, 0.0000f, 0.0000f, -60f, 87.25f},
                    {0.23f, 0.23f, 0.0000f, 0.0000f, -55.4f, 91.4f},
                    {0.24f, 0.24f, 0.0000f, 0.0000f, -50.4f, 95.2f},
                    {0.25f, 0.25f, 0.0000f, 0.0000f, -45.1f, 98.6f},
                    {0.2336f, 0.2287f, 0.0000f, 0.0000f, -37.45f, 102.65f},
                    {0.2179f, 0.2083f, 0.0000f, 0.0000f, -29.8f, 105.8f},
                    {0.203f, 0.1889f, 0.0000f, 0.0000f, -22.4f, 108.2f},
                    {0.1889f, 0.1706f, 0.0000f, 0.0000f, -15.1f, 110f},
                    {0.1755f, 0.1532f, 0.0000f, 0.0000f, -8.35f, 112.1f},
                    {0.1629f, 0.1368f, 0.0000f, 0.0000f, -2.3f, 114.95f},
                    {0.1511f, 0.1214f, 0.0000f, 0.0000f, 2.95f, 118.3f},
                    {0.14f, 0.107f, 0.0000f, 0.0000f, 7.4f, 122.05f},
                    {0.1297f, 0.09364f, 0.0000f, 0.0000f, 11.2f, 125.9f},
                    {0.1202f, 0.08124f, 0.0000f, 0.0000f, 14.5f, 129.7f},
                    {0.1114f, 0.06982f, 0.0000f, 0.0000f, 17.35f, 133.35f},
                    {0.1034f, 0.0594f, 0.0000f, 0.0000f, 19.75f, 136.8f},
                    {0.09616f, 0.04999f, 0.0000f, 0.0000f, 21.75f, 140.05f},
            }
    };
    private final float[][] AnimatedColorTransform = {
            {512, 512, 512, 256}, {-200, -200, -200, 0}
    };
    private final float[] matrixTransform = {1.0000f, 1.0000f, 0.0000f, 0.0000f, -21.6f, 139.3f};

    private final float[][][] colorTransform = {
            {{179, 179, 179, 256},{182, 77, 0, 0}},
            {{178, 178, 178, 256},{182, 79, 1, 0}},
            {{177, 177, 177, 256},{183, 81, 2, 0}},
            {{176, 176, 176, 256},{183, 82, 2, 0}},
            {{175, 175, 175, 256},{183, 84, 3, 0}},
            {{174, 174, 174, 256},{184, 86, 4, 0}},
            {{173, 173, 173, 256},{184, 88, 5, 0}},
            {{172, 172, 172, 256},{184, 90, 5, 0}},
            {{171, 171, 171, 256},{185, 92, 6, 0}},
            {{170, 170, 170, 256},{185, 93, 7, 0}},
            {{169, 169, 169, 256},{185, 95, 8, 0}},
            {{168, 168, 168, 256},{186, 97, 9, 0}},
            {{167, 167, 167, 256},{186, 99, 9, 0}},
            {{166, 166, 166, 256},{186, 101, 10, 0}},
            {{165, 165, 165, 256},{187, 102, 11, 0}},
            {{164, 164, 164, 256},{187, 104, 12, 0}},
            {{163, 163, 163, 256},{187, 106, 12, 0}},
            {{162, 162, 162, 256},{188, 108, 13, 0}},
            {{161, 161, 161, 256},{188, 110, 14, 0}},
            {{160, 160, 160, 256},{188, 112, 15, 0}},
            {{159, 159, 159, 256},{189, 113, 16, 0}},
            {{158, 158, 158, 256},{189, 115, 16, 0}},
            {{157, 157, 157, 256},{189, 117, 17, 0}},
            {{156, 156, 156, 256},{190, 119, 18, 0}},
            {{155, 155, 155, 256},{190, 121, 19, 0}},
            {{154, 154, 154, 256},{191, 123, 20, 0}},
            {{152, 152, 152, 256},{191, 124, 20, 0}},
            {{151, 151, 151, 256},{191, 126, 21, 0}},
            {{150, 150, 150, 256},{192, 128, 22, 0}},
            {{149, 149, 149, 256},{192, 130, 23, 0}},
            {{148, 148, 148, 256},{192, 132, 23, 0}},
            {{147, 147, 147, 256},{193, 133, 24, 0}},
            {{146, 146, 146, 256},{193, 135, 25, 0}},
            {{145, 145, 145, 256},{193, 137, 26, 0}},
            {{144, 144, 144, 256},{194, 139, 27, 0}},
            {{143, 143, 143, 256},{194, 141, 27, 0}},
            {{142, 142, 142, 256},{194, 143, 28, 0}},
            {{141, 141, 141, 256},{195, 144, 29, 0}},
            {{140, 140, 140, 256},{195, 146, 30, 0}},
            {{139, 139, 139, 256},{195, 148, 30, 0}},
            {{138, 138, 138, 256},{196, 150, 31, 0}},
            {{137, 137, 137, 256},{196, 152, 32, 0}},
            {{136, 136, 136, 256},{196, 153, 33, 0}},
            {{135, 135, 135, 256},{197, 155, 34, 0}},
            {{134, 134, 134, 256},{197, 157, 34, 0}},
            {{133, 133, 133, 256},{197, 159, 35, 0}},
            {{132, 132, 132, 256},{198, 161, 36, 0}},
            {{131, 131, 131, 256},{198, 163, 37, 0}},
            {{130, 130, 130, 256},{198, 164, 37, 0}},
            {{129, 129, 129, 256},{199, 166, 38, 0}},
            {{128, 128, 128, 256},{199, 168, 39, 0}}
    };

    private final Calendar calendar;

    ArrayList<Object> removeObjects = new ArrayList<>();
    int frameCounter = 0;
    int maxFrames = 8;
    int numClips = minObjects;
    float svgScale = 1.0f;
    boolean init = false;
    int animCount =1;

    public Leave (final Context context, final Calendar calendar) {
        super(context, textureList, null);
        this.calendar = calendar;
    }

    private boolean get0703() {
        svgScale = textureManager.dipToPixels(1);
        animCount = (int)((height / 280.0f) + 0.5f);
        int currentMonth = calendar.get(Calendar.MONTH) + 1;
        int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
        return (currentMonth==3) && (currentDay==7);
    }

    private void createObject() {
        if (objects.size() >= numClips) return;
        if (random.nextInt(5) > 0) return;
        int textureIndex = textureManager.getTextureIndex(textureList[0][0]);
        Object object = new Object(textureManager.getTexture(textureIndex), 1.0f);
        object.setObjectScale(1.0f/svgScale);
        resetObject(object);
        objects.add(object);
    }

    private void resetObject(Object object) {
        int _x = random.nextInt(width);
        int _yscale = random.nextInt(50) + 100;
        int _xscale = _yscale;
        if (random.nextInt(2) == 0) _xscale *= -1;
        object.resetViewMatrix();
        object.setColorTransform(AnimatedColorTransform);
        object.setViewColorTransform(colorTransform[_yscale - 100]);
        object.setViewScale(_xscale, _yscale);
        int delta = (int)(100 + ((_yscale - 70) * -1.3f));
        object.setViewPosition(_x + matrixTransform[4], (float) (height - delta - ((animCount * 280.0) * (_yscale/100.0f))) + (matrixTransform[5] * (_yscale/100.0f)));
        object.index = animCount;
        object.frameCounter = 0;
        object.animCounter = 0;
        object.remove = false;
    }


    public void update(boolean createObject) {
        frameCounter = (frameCounter+1) % maxFrames;
        if (!init && createObject) numClips = get0703()?maxObjects:(minObjects + random.nextInt(maxObjects - 4));
        init = createObject;
        if (createObject && (frameCounter == 2)) createObject();
        for (Object object : objects) {
            object.resetMatrix();

            if (object.remove) {
                object.setViewTranslate(0, 285 * (object.getViewScaleY()/100.0f));
                object.remove = false;
            }
            if (object.index > 0)
                if (object.index % 2 == 0) object.setTexture(textureManager.getTexture(textureManager.getTextureIndex(AnimateTextureList[1][AnimateTextureList[1].length-object.animCounter-1])), 1.0f);
                else object.setTexture(textureManager.getTexture(textureManager.getTextureIndex(AnimateTextureList[1][object.animCounter])), 1.0f);
            else object.setTexture(textureManager.getTexture(textureManager.getTextureIndex(AnimateTextureList[object.index][object.animCounter])), 1.0f);
            object.setTransform(AnimatedTextureMatrix[object.index][object.frameCounter]);
            object.frameCounter = (object.frameCounter+1)  % AnimatedTextureMatrix[object.index].length;
            object.animCounter =  (object.animCounter+1)  % AnimateTextureList[object.index > 0 ? 1:0].length;
            if (object.frameCounter == 0 ) {
                object.animCounter = 0;
                if (--object.index > 0) object.remove = true;
            }
            if (object.index < 0) {
                if (createObject) resetObject(object);
                else removeObjects.add(object);
            }
        }
        for (Object object : removeObjects) objects.remove(object);
        removeObjects.clear();


    }

}
