package com.shapesecurity.salvation.directives;

import com.shapesecurity.salvation.directiveValues.SourceExpression;

import javax.annotation.Nonnull;
import java.util.Set;

public class MediaSrcDirective extends FetchDirective {
	@Nonnull
	private static final String name = "media-src";

	public MediaSrcDirective(@Nonnull Set<SourceExpression> sourceExpressions) {
		super(MediaSrcDirective.name, sourceExpressions);
	}

	@Nonnull
	@Override
	public Directive<SourceExpression> construct(Set<SourceExpression> newValues) {
		return new MediaSrcDirective(newValues);
	}
}
