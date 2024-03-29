/*
 * Copyright (c) 1999-2003, Carnegie Mellon University. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 * 
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 
 * 3. Products derived from the software may not be called "Alice",
 *    nor may "Alice" appear in their name, without prior written
 *    permission of Carnegie Mellon University.
 * 
 * 4. All advertising materials mentioning features or use of this software
 *    must display the following acknowledgement:
 *    "This product includes software developed by Carnegie Mellon University"
 */

package edu.cmu.cs.stage3.alice.scenegraph;

/**
 * @author Dennis Cosgrove
 */
public abstract class Fog extends Affector {
	public static final Property COLOR_PROPERTY = new Property( Fog.class, "COLOR" );
	private edu.cmu.cs.stage3.alice.scenegraph.Color m_color = new edu.cmu.cs.stage3.alice.scenegraph.Color( 1,1,1,1 );

	/**
	 * @see #setColor
	 */
	public edu.cmu.cs.stage3.alice.scenegraph.Color getColor() {
		return m_color;
	}
	/**
	 * sets the color property.<br>
	 * visual elements are fogged by this color.<br>
	 *
	 * @param color (default: white)
	 * @see #getColor
	 */
	public void setColor( edu.cmu.cs.stage3.alice.scenegraph.Color color ) {
		if( notequal( m_color, color ) ) {
			m_color = color;
			onPropertyChange( COLOR_PROPERTY );
		}
	}
}
