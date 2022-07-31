package example07;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetSearchEx {

	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<>();
		
		// 알파벳의 유니코드에 따라 이진트리에 각각 좌측부터 저장된다.
		treeSet.add("apple");
		treeSet.add("f");
		treeSet.add("fo    rever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("guess");
		treeSet.add("cherry");
		System.out.println(treeSet);
		
		// 여기서 헷갈릴 수가 있는 c ~ f 사이라는 것은 시작이 c부터 해서
		// 끝이 f 부분이 f 한자는 검색을 해주지만, f 포함 2자 이상은 검색을 하지 않는다.
		// 즉, f 한자는 허용하지만 f 포함 2자 이상은 허용 안한다.
		System.out.println("[c ~ f] 사이의 단어를 검색해보기");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
		System.out.println(rangeSet);
	}

}
