/* OpenRemote, the Home of the Digital Home.
* Copyright 2008-2012, OpenRemote Inc.
*
* See the contributors.txt file in the distribution for a
* full listing of individual contributors.
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU Affero General Public License as
* published by the Free Software Foundation, either version 3 of the
* License, or (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU Affero General Public License for more details.
*
* You should have received a copy of the GNU Affero General Public License
* along with this program. If not, see <http://www.gnu.org/licenses/>.
*/
package org.openremote.web.console.panel.entity.component;

import org.openremote.web.console.panel.entity.Link;
/**
 * The label can set font size and color, change text by polling status.
 *  
 * @author <a href="mailto:richard@openremote.org">Richard Turner</a>
 */
public interface LabelComponent {
	Integer getId();
	String getText();
	String getColor();
	Integer getFontSize();
	Link getLink();
	
	void setId(Integer id);
   void setText(String text);
	void setColor(String color);
   void setFontSize(Integer fontSize);
   void setLink(Link link);
}
