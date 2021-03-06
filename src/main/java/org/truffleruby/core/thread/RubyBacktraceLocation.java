/*
 * Copyright (c) 2020 Oracle and/or its affiliates. All rights reserved. This
 * code is released under a tri EPL/GPL/LGPL license. You can use it,
 * redistribute it and/or modify it under the terms of the:
 *
 * Eclipse Public License version 2.0, or
 * GNU General Public License version 2, or
 * GNU Lesser General Public License version 2.1.
 */
package org.truffleruby.core.thread;

import com.oracle.truffle.api.object.Shape;
import org.truffleruby.language.RubyDynamicObject;
import org.truffleruby.language.backtrace.Backtrace;

public class RubyBacktraceLocation extends RubyDynamicObject {

    final Backtrace backtrace;
    final int activationIndex;

    public RubyBacktraceLocation(Shape shape, Backtrace backtrace, int activationIndex) {
        super(shape);
        this.backtrace = backtrace;
        this.activationIndex = activationIndex;
    }

}
