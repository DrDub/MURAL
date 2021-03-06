/*
 * Copyright (c) 2014 François Cabrol.
 *
 *  This file is part of MURAL.
 *
 *     MURAL is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     MURAL is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with MURAL.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.cabrol.francois.mural.generator.rulebased.method

object Methods extends Enumeration {
  val rulesBased = Method("com.cabrol.francois.mural.generator.rulebased.method.RuleBased")
  // val keepingRhythm = Method("com.cabrol.francois.mural.generator.rulebased.method.KeepingRhythm")

  case class Method(name: String) extends super.Val(nextId, name) {
    def getObject : GenerationMethod = Class.forName(name).newInstance.asInstanceOf[GenerationMethod];
  }

}
