package in.rest.api.filter;

import java.util.List;
import java.util.Set;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;

import org.springframework.http.HttpHeaders;
//import io.netty.handler.codec.http.HttpHeaders;
import reactor.core.publisher.Mono;
import org.springframework.stereotype.Component;

@Component
public class filters implements GlobalFilter {

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		org.springframework.http.server.reactive.ServerHttpRequest request =   exchange.getRequest();
		
		HttpHeaders headers = request.getHeaders();
		
		Set<String> keySet = headers.keySet();
		
		keySet.forEach(key ->{
			List<String> values = headers.get(key);
			System.out.println(key+ ":"+values);
		});
		return chain.filter(exchange);
		
		
	}

}
