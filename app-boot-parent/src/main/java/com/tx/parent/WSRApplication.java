package com.tx.parent;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.tx.child1.config.WSRChild1Context;
import com.tx.child2.config.WSRChild2Context;
import com.tx.parent.config.WSRParentContext;


public class WSRApplication {

    public static void main(String[] args) {
    	new SpringApplicationBuilder()
    		.parent(WSRParentContext.class).web(WebApplicationType.NONE)
    		.child(WSRChild1Context.class).web(WebApplicationType.SERVLET)
    		.sibling(WSRChild2Context.class).web(WebApplicationType.SERVLET)
    		.run(args);
	}

}
