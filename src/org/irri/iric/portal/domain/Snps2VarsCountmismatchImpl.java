package org.irri.iric.portal.domain;

import java.math.BigDecimal;

/**
 * Implementation for Snps2VarsCountmismatch
 * 
 * @author LMansueto
 *
 */
public class Snps2VarsCountmismatchImpl implements Snps2VarsCountmismatch {

	private BigDecimal var1;
	private BigDecimal var2;
	private BigDecimal mismatch;

	public Snps2VarsCountmismatchImpl(BigDecimal var1, BigDecimal var2, BigDecimal mismatch) {
		super();

		if (var1.longValue() > var2.longValue())
			throw new RuntimeException("Var1 should be <= Var2");

		this.var1 = var1;
		this.var2 = var2;
		this.mismatch = mismatch;
	}

	@Override
	public BigDecimal getVar1() {

		return var1;
	}

	@Override
	public BigDecimal getVar2() {

		return var2;
	}

	@Override
	public BigDecimal getMismatch() {

		return mismatch;
	}

	@Override
	public BigDecimal getDist() {

		return mismatch;
	}

}
