package com.scrat.everchanging;

import android.content.Context;

import com.scrat.everchanging.util.ReusableIterator;

final class Background extends TextureObject {

    private static final float[][][][] colorTransformValues = {
            /*1 season */
            {
                    {
                            {0, 282, 768, 256},
                            {0, -90, -30, 0}
                    },
                    {
                            {51, 282, 640, 256},
                            {0, -70, -20, 0}
                    },
                    {
                            {128, 269, 384, 256},
                            {0, -45, -15, 0}
                    },
                    {
                            {256, 256, 256, 256},
                            {0, 0, 0, 0}
                    },
                    {
                            {128, 269, 384, 256},
                            {0, -45, -15, 0}
                    },
                    {
                            {51, 282, 640, 256},
                            {0, -70, -20, 0}
                    },
                    {
                            {0, 282, 768, 256},
                            {0, -90, -30, 0}
                    }
            },

            /*2 season */
            {
                    {
                            {0, 384, 256, 256},
                            {0, -20, -20, 0}
                    },
                    {
                            {128, 320, 256, 256},
                            {0, -10, -10, 0}
                    },
                    {
                            {192, 282, 256, 256},
                            {0, -5, -5, 0}
                    },
                    {
                            {256, 256, 256, 256},
                            {0, 0, 0, 0}
                    },
                    {
                            {192, 282, 256, 256},
                            {0, -5, -5, 0}
                    },
                    {
                            {128, 320, 256, 256},
                            {0, -10, -10, 0}
                    },
                    {
                            {0, 384, 256, 256},
                            {0, -20, -20, 0}
                    }
            },

            /*3 season */
            {
                    {
                            {0, 358, 640, 256},
                            {0, -20, 0, 0}
                    },
                    {
                            {128, 320, 448, 256},
                            {0, -5, 0, 0}
                    },
                    {
                            {192, 269, 320, 256},
                            {0, 0, 0, 0}
                    },
                    {
                            {256, 256, 256, 256},
                            {0, 0, 0, 0}
                    },
                    {
                            {192, 269, 320, 256},
                            {0, 0, 0, 0}
                    },
                    {
                            {128, 320, 448, 256},
                            {0, -5, 0, 0}
                    },
                    {
                            {0, 358, 640, 256},
                            {0, -20, 0, 0}
                    }
            },
            /*4 season */
            {
                    {
                            {128, 333, 717, 256},
                            {-255, -110, -50, 0}
                    }
                    , {
                    {128, 205, 384, 256},
                    {0, -10, -10, 0}
            },
                    {
                            {192, 230, 320, 256},
                            {0, -5, -5, 0}
                    },
                    {
                            {256, 256, 256, 256},
                            {0, 0, 0, 0}
                    },
                    {
                            {192, 230, 320, 256},
                            {0, -5, -5, 0}
                    },
                    {
                            {128, 205, 384, 256},
                            {0, -10, -10, 0}
                    },
                    {
                            {128, 333, 717, 256},
                            {-255, -110, -50, 0}
                    }
            },
            /* Red Valentines day & NewYear */
            {
                    {
                            {-256, 640, 896, 256},
                            {0, -50, -30, 0}
                    },
                    {
                            {77, 435, 512, 256},
                            {0, -20, -30, 0}
                    },
                    {
                            {179, 333, 461, 256},
                            {0, -10, -10, 0}
                    },
                    {
                            {256, 256, 256, 256},
                            {0, 0, 0, 0}
                    },
                    {
                            {179, 333, 461, 256},
                            {0, -10, -10, 0}
                    },
                    {
                            {77, 435, 512, 256},
                            {0, -20, -30, 0}
                    },
                    {
                            {-256, 640, 896, 256},
                            {0, -50, -30, 0}
                    }
            },

            /* Red China New Year */
            {
                    {
                            {0, 512, 896, 256},
                            {0, -40, -30, 0}
                    },
                    {
                            {77, 435, 512, 256},
                            {0, -20, 0, 0}
                    },
                    {
                            {179, 333, 461, 256},
                            {0, -10, -10, 0}
                    },
                    {
                            {256, 256, 256, 256},
                            {0, 0, 0, 0}
                    },
                    {
                            {179, 333, 461, 256},
                            {0, -10, -10, 0}},
                    {
                            {77, 435, 512, 256},
                            {0, -20, 0, 0}
                    },
                    {
                            {0, 512, 896, 256},
                            {0, -40, -30, 0}
                    }
            }
    };

    private static final String[][] textureList = {{
            "image_290", //Green
            "image_311", //Violet
            "image_323", //Orange
            "image_334", //Yellow
            "image_301", //Red
    }};

    private static final float SCALE = 0.25f;

    private int currentSeason = -1;

    Background(final Context context) {
        super(context, textureList, null);
    }

    void createObject(final int season) {
        currentSeason = season;
        int textureIndex = textureManager.getTextureIndex(textureList[0][season]);
        TextureManager.Texture texture = textureManager.getTexture(textureIndex);

        if (objects.objectsInUseCount() != 0) {
            final ReusableIterator<Object> iterator = objects.iterator();
            iterator.acquire();

            while (iterator.hasNext()) {
                iterator.next().setTexture(texture, SCALE);
            }

            iterator.release();
        } else {
            final Object object = objects.obtain(texture, SCALE);
            object.setObjectScale(1.0f);
            object.resetMatrix();
            object.resetViewMatrix();
            object.setScale(ratio, ratio); //Масштабируем по высоте, иначе не красиво.
            object.setTranslate(width - (object.texture.width) * SCALE * 0.5f * ratio, (object.texture.height) * SCALE * 0.5f * ratio);
        }
    }

    void update(final int season, final int timesOfDay) {
        int s = season == 5 ? 4 : season;
        if (currentSeason != s) createObject(s);

        final ReusableIterator<Object> iterator = objects.iterator();
        iterator.acquire();

        while (iterator.hasNext()) {
            iterator.next().setColorTransform(colorTransformValues[season][timesOfDay]);
        }

        iterator.release();
    }
}
