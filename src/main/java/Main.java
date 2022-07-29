import com.devCat.springboot.config.Config;
import com.devCat.springboot.logic.BubbleSort;
import com.devCat.springboot.logic.Sort;
import com.devCat.springboot.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//        Sort<String> sort = context.getBean(Sort.class);
        SortService sortService = context.getBean(SortService.class);
        System.out.println("{result} " + sortService.doSort(Arrays.asList(args)));

        System.out.println("git 풀리퀘스트");
        System.out.println("git 풀 리퀘스트  테스트");
//        System.out.println("{result} " + sort.sort(Arrays.asList()));

        // IOC를 적용하면?
        
    }
}
