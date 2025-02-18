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
import org.mini2Dx.gdx.Input;

public class InputHandler {

    boolean spacePressed() {
        return Mdx.input.isKeyJustPressed(Input.Keys.SPACE);
    } // Input "Space Bar" from keyboard
    // boolean ctrlPressed() {return Mdx.input.isKeyJustPressed(Input.Keys.CONTROL_RIGHT)} // Input "Ctrl Right" from keyboard
}
