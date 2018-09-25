package io.dunyalabs.kafka.model;

import java.util.List;

public class Data {
	private String trx_id;
	private boolean accepted;
	private List<Action> actions;
	private List<Object> context_free_actions;
	private List<Object> context_free_data;
	private CreatedAt createdAt;
	private int delay_sec;
	private String expiration;
	private boolean implicit;
	private int max_cpu_usage_ms;
	private int max_net_usage_words;
	private long ref_block_num;
	private long ref_block_prefix;
	private boolean scheduled;

	public String getTrx_id() {
		return trx_id;
	}

	public void setTrx_id(String trx_id) {
		this.trx_id = trx_id;
	}

	public boolean isAccepted() {
		return accepted;
	}

	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}

	public List<Action> getActions() {
		return actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

	public List<Object> getContext_free_actions() {
		return context_free_actions;
	}

	public void setContext_free_actions(List<Object> context_free_actions) {
		this.context_free_actions = context_free_actions;
	}

	public List<Object> getContext_free_data() {
		return context_free_data;
	}

	public void setContext_free_data(List<Object> context_free_data) {
		this.context_free_data = context_free_data;
	}

	public CreatedAt getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(CreatedAt createdAt) {
		this.createdAt = createdAt;
	}

	public int getDelay_sec() {
		return delay_sec;
	}

	public void setDelay_sec(int delay_sec) {
		this.delay_sec = delay_sec;
	}

	public String getExpiration() {
		return expiration;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}

	public boolean isImplicit() {
		return implicit;
	}

	public void setImplicit(boolean implicit) {
		this.implicit = implicit;
	}

	public int getMax_cpu_usage_ms() {
		return max_cpu_usage_ms;
	}

	public void setMax_cpu_usage_ms(int max_cpu_usage_ms) {
		this.max_cpu_usage_ms = max_cpu_usage_ms;
	}

	public int getMax_net_usage_words() {
		return max_net_usage_words;
	}

	public void setMax_net_usage_words(int max_net_usage_words) {
		this.max_net_usage_words = max_net_usage_words;
	}

	public long getRef_block_num() {
		return ref_block_num;
	}

	public void setRef_block_num(long ref_block_num) {
		this.ref_block_num = ref_block_num;
	}

	public long getRef_block_prefix() {
		return ref_block_prefix;
	}

	public void setRef_block_prefix(long ref_block_prefix) {
		this.ref_block_prefix = ref_block_prefix;
	}

	public boolean isScheduled() {
		return scheduled;
	}

	public void setScheduled(boolean scheduled) {
		this.scheduled = scheduled;
	}

	public Data(String trx_id, boolean accepted, List<Action> actions, List<Object> context_free_actions,
			List<Object> context_free_data, CreatedAt createdAt, int delay_sec, String expiration, boolean implicit,
			int max_cpu_usage_ms, int max_net_usage_words, long ref_block_num, long ref_block_prefix,
			boolean scheduled) {
		super();
		this.trx_id = trx_id;
		this.accepted = accepted;
		this.actions = actions;
		this.context_free_actions = context_free_actions;
		this.context_free_data = context_free_data;
		this.createdAt = createdAt;
		this.delay_sec = delay_sec;
		this.expiration = expiration;
		this.implicit = implicit;
		this.max_cpu_usage_ms = max_cpu_usage_ms;
		this.max_net_usage_words = max_net_usage_words;
		this.ref_block_num = ref_block_num;
		this.ref_block_prefix = ref_block_prefix;
		this.scheduled = scheduled;
	}

	public Data() {
		super();
	}
	
}
