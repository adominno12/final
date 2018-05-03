/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.custag;

import javax.servlet.jsp.JspWriter;
import java.util.Calendar; 
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author Nguyễn Bùi Thội
 */
public class NewTagHandler extends SimpleTagSupport {

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        try {
            out.print(Calendar.getInstance().getTime());

            
        } catch (java.io.IOException ex) {
        }
    }
    
}
