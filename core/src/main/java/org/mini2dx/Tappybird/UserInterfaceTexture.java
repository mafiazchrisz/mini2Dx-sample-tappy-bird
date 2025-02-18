/*******************************************************************************
 * Copyright 2019 Viridian Software Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package org.mini2dx.Tappybird;

import org.mini2Dx.core.Mdx;
import org.mini2Dx.core.graphics.Texture;

public class UserInterfaceTexture {

    private static final String NUMBER_0_LOCATION = "UserInterface/Numbers/number0.png";
    private static final String NUMBER_1_LOCATION = "UserInterface/Numbers/number1.png";
    private static final String NUMBER_2_LOCATION = "UserInterface/Numbers/number2.png";
    private static final String NUMBER_3_LOCATION = "UserInterface/Numbers/number3.png";
    private static final String NUMBER_4_LOCATION = "UserInterface/Numbers/number4.png";
    private static final String NUMBER_5_LOCATION = "UserInterface/Numbers/number5.png";
    private static final String NUMBER_6_LOCATION = "UserInterface/Numbers/number6.png";
    private static final String NUMBER_7_LOCATION = "UserInterface/Numbers/number7.png";
    private static final String NUMBER_8_LOCATION = "UserInterface/Numbers/number8.png";
    private static final String NUMBER_9_LOCATION = "UserInterface/Numbers/number9.png";

    private static final String GAME_OVER_TEXT_LOCATION = "UserInterface/textGameOver.png"; // Gave Over text
    private static final String PRESS_SPACE_TEXT_LOCATION = "UserInterface/textPressSpace.png"; // Press Space text
    private static final String HIGHSCORE_TEXT_LOCATION = "UserInterface/textHighscore.png"; // High Score text

    Texture numberZeroTexture = Mdx.graphics.newTexture(Mdx.files.internal(NUMBER_0_LOCATION));
    Texture numberOneTexture = Mdx.graphics.newTexture(Mdx.files.internal(NUMBER_1_LOCATION));
    Texture numberTwoTexture = Mdx.graphics.newTexture(Mdx.files.internal(NUMBER_2_LOCATION));
    Texture numberThreeTexture = Mdx.graphics.newTexture(Mdx.files.internal(NUMBER_3_LOCATION));
    Texture numberFourTexture = Mdx.graphics.newTexture(Mdx.files.internal(NUMBER_4_LOCATION));
    Texture numberFiveTexture = Mdx.graphics.newTexture(Mdx.files.internal(NUMBER_5_LOCATION));
    Texture numberSixTexture = Mdx.graphics.newTexture(Mdx.files.internal(NUMBER_6_LOCATION));
    Texture numberSevenTexture = Mdx.graphics.newTexture(Mdx.files.internal(NUMBER_7_LOCATION));
    Texture numberEightTexture = Mdx.graphics.newTexture(Mdx.files.internal(NUMBER_8_LOCATION));
    Texture numberNineTexture = Mdx.graphics.newTexture(Mdx.files.internal(NUMBER_9_LOCATION));

    Texture gameOverTexture = Mdx.graphics.newTexture(Mdx.files.internal(GAME_OVER_TEXT_LOCATION));
    Texture getReadyTexture = Mdx.graphics.newTexture(Mdx.files.internal(PRESS_SPACE_TEXT_LOCATION));
    Texture highscoreTexture = Mdx.graphics.newTexture(Mdx.files.internal(HIGHSCORE_TEXT_LOCATION));
}