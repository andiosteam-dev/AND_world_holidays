/*
 * Copyright 2022 Kalendar Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.alejo.world_holidays.core.kalendar.component.day.config

import androidx.compose.ui.graphics.Color
import dev.alejo.world_holidays.ui.theme.BlueDark
import dev.alejo.world_holidays.ui.theme.LightWhite
import dev.alejo.world_holidays.ui.theme.WhiteCake

data class KalendarDayColors(
    val textColor: Color, // Default Text Color
    val selectedTextColor: Color, // Selected Text Color
)

object KalendarDayDefaultColors {

    fun defaultColors() = KalendarDayColors(WhiteCake, WhiteCake)
}
